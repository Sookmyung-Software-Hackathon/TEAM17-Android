package com.example.team17.data.api

import com.example.team17.data.model.response.home.ResMyBoggleData
import retrofit2.http.GET
import retrofit2.http.Header

interface HomeService {
    @GET("myboggle")
    suspend fun getMyBoggle (
        @Header("X-AUTH-TOKEN") token: String
    ) : ResMyBoggleData
}