package com.example.team17.domain.repository

import com.example.team17.domain.model.home.MyBoggleInfo

interface HomeRepository {
    suspend fun getMyBoggle(): List<MyBoggleInfo>
}