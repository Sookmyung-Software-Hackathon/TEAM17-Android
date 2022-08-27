package com.example.team17.data.mapper

import com.example.team17.data.model.response.user.ResSignUpSuccessData
import com.example.team17.domain.model.user.SignUpSuccessData

object UserMapper {
    fun mapperToSignUpResultSuccessData(resSignUpSuccessData: ResSignUpSuccessData): SignUpSuccessData {
        return SignUpSuccessData(
            data = resSignUpSuccessData.data

        )
    }
}