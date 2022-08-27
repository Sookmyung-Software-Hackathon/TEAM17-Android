package com.example.team17.data.datasource.user

import com.example.team17.data.api.LoginService
import com.example.team17.data.model.request.user.ReqSignUpSuccessData
import com.example.team17.data.model.response.user.ResSignUpSuccessData

class UserRemoteDataSource(private val userService: LoginService): UserDataSource {
    override suspend fun postSignUp(body: ReqSignUpSuccessData): ResSignUpSuccessData {
        return userService.postSignUp(body)
    }

}