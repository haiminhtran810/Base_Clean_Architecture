package com.htm.data.remote.interceptor

import com.htm.data.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response

class HeaderInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        //val token: Token? = AppPrefs(context, Gson()).getToken()
        var request = chain.request()
        val newUrl = request.url().newBuilder().addQueryParameter(
            API_KEY,
            BuildConfig.API_KEY
        ).build()
        request = request.newBuilder()
            .url(newUrl)
            .addHeader(CONTENT_TYPE, APPLICATION_JSON)
            //?.apply { token?.token?.let { addHeader("Authorization", "Bearer $it") } }
            .method(request.method(), request.body()).build()
        return chain.proceed(request)
    }

    companion object {
        const val API_KEY = "api_key"
        const val CONTENT_TYPE = "Content-Type"
        const val APPLICATION_JSON = "application/json"
    }
}