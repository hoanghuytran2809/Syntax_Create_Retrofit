package com.example.syntax_create_retrofit.model

import com.google.gson.annotations.SerializedName

//Bước 2: Tạo class để hứng data
class DemoData {
    @SerializedName("userId")
    val userId:Int? = null

    @SerializedName("id")
    val id:Int? = null

    @SerializedName("title")
    val title:String? = null

    @SerializedName("body")
    val body:String? = null
}