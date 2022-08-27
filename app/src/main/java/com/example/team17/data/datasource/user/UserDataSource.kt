package com.example.team17.data.datasource.user

import com.example.team17.data.model.request.user.ReqSignUpSuccessData
import com.example.team17.data.model.response.user.ResSignUpSuccessData

interface UserDataSource {
    suspend fun postSignUp(body: ReqSignUpSuccessData): ResSignUpSuccessData
}