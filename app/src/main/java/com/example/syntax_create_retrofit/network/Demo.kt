package com.example.syntax_create_retrofit.network

import com.example.syntax_create_retrofit.model.DemoData
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface Demo {
    @GET("objects")
    suspend fun getPost(): Response<List<DemoData>>
}

//https://api.restful-api.dev/objects Get
//https://api.restful-api.dev/objects1 Get
//https://api.restful-api.dev/objects2 Get