package com.example.sobok_android.data.repository.login.request

import com.example.team17.data.datasource.user.UserDataSource
import com.example.team17.data.mapper.UserMapper
import com.example.team17.data.model.request.user.ReqSignUpSuccessData
import com.example.team17.domain.model.user.SignUpSuccessData
import com.example.team17.domain.repository.UserRepository

class SignUpRepositoryImpl(private val userDataSource: UserDataSource) : UserRepository {
    override suspend fun postSignUpResult(body: ReqSignUpSuccessData): SignUpSuccessData {
        return UserMapper.mapperToSignUpResultSuccessData(userDataSource.postSignUp(body))
    }
}

