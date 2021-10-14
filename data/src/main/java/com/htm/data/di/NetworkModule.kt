package com.htm.data.di

import com.htm.data.remote.api.ServiceApi
import com.htm.data.remote.interceptor.HeaderInterceptor
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.BuildConfig
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit

private const val DEFAULT_CONNECTION_TIMEOUT = 15000L

val networkModule = module {
    single {
        return@single createRetrofit(
            baseUrl = "https://api.themoviedb.org/3/",
            connectionTimeout = DEFAULT_CONNECTION_TIMEOUT,
            headerInterceptor = get(),
            loggingInterceptor = get(),
            moshi = get()
        )
    }

    factory {
        HeaderInterceptor()
    }

    single {
        Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()
    }

    single {
        get<Retrofit>().create(ServiceApi::class.java)
    }

    factory {
        return@factory HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
    }

}

fun createRetrofit(
    baseUrl: String,
    connectionTimeout: Long,
    headerInterceptor: HeaderInterceptor,
    loggingInterceptor: HttpLoggingInterceptor,
    moshi: Moshi
): Retrofit {

    val builder = OkHttpClient.Builder()
        .connectTimeout(connectionTimeout, TimeUnit.MILLISECONDS)
        .addInterceptor(headerInterceptor)

    if (BuildConfig.DEBUG) {
        builder.addInterceptor(loggingInterceptor)
    }

    val client = builder.build()

    return Retrofit.Builder()
        .baseUrl(baseUrl)
        .client(client)
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .build()
}