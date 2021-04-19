package com.aitumik.tujuanexapp.api

import okhttp3.Interceptor
import okhttp3.Response

//If you will ever use the API key this will be of great use
class RequestInterceptor: Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()
        var originalUrl = originalRequest.url

        val url = originalUrl.newBuilder()
            .addQueryParameter("api_key","The API key here")
            .build()
        val requestBuilder = originalRequest.newBuilder().url(url);
        val request = requestBuilder.build()
        return chain.proceed(request)
    }
}