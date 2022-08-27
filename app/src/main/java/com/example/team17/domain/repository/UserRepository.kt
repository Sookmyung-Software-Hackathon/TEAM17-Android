package com.example.team17.domain.repository

import com.example.team17.data.model.request.user.ReqSignUpSuccessData
import com.example.team17.domain.model.user.SignUpSuccessData

interface UserRepository {
    suspend fun postSignUpResult(body: ReqSignUpSuccessData): SignUpSuccessData
}