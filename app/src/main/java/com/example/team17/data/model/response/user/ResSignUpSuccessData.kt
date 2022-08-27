package com.example.team17.data.model.response.user


import com.google.gson.annotations.SerializedName

data class ResSignUpSuccessData(
    @SerializedName("data")
    val data: String,
    @SerializedName("message")
    val message: String,
    @SerializedName("status")
    val status: Int
)