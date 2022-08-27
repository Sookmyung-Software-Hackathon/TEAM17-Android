package com.example.team17.data.model.request.user

data class ReqSignUpSuccessData(
    val email: String,
    val pw: String,
    val nickname: String,
    val birth_year: Int,
    val team_id: String
)