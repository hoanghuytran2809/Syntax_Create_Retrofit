package com.example.syntax_create_retrofit.network

import com.example.syntax_create_retrofit.model.DemoData
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface Demo {
    @GET("posts/{id}")
    suspend fun getPost(@Path("id") id: Int): Response<DemoData>
}