package com.aitumik.tujuanexapp.api

import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface TujuanexAPIService {

    @POST("/api/v1/create")
    suspend fun createUser(@Body requestBody: RequestBody): Response<ResponseBody>

    @GET("/api/v1/users")
    suspend fun getUsers(): Response<ResponseBody>
}
