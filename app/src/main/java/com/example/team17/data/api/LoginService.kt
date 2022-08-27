package com.example.team17.data.api

import com.example.team17.data.model.request.user.ReqSignInSuccessData
import com.example.team17.data.model.request.user.ReqSignUpSuccessData
import com.example.team17.data.model.response.user.ResSignUpSuccessData
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginService {
    @POST("member/signup")
    suspend fun postSignUp(
        @Body body: ReqSignUpSuccessData
    ): ResSignUpSuccessData
}