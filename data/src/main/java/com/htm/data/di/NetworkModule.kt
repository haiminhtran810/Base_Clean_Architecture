package com.htm.data.di

import com.htm.data.remote.api.ServiceApi
import com.htm.data.remote.interceptor.HeaderInterceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.BuildConfig
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit

private const val DEFAULT_CONNECTION_TIMEOUT = 15000L

internal val networkModule = module {
    single {
        createRetrofit(
            baseUrl = "",
            connectionTimeout = DEFAULT_CONNECTION_TIMEOUT,
            headerInterceptor = get(),
            loggingInterceptor = get()
        )
    }

    factory {
        HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
    }

    factory {
        HeaderInterceptor()
    }

    single {
        get<Retrofit>().create(ServiceApi::class.java)
    }

}

fun createRetrofit(
    baseUrl: String,
    connectionTimeout: Long,
    headerInterceptor: HeaderInterceptor,
    loggingInterceptor: HttpLoggingInterceptor
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
        .addConverterFactory(MoshiConverterFactory.create())
        .build()
}