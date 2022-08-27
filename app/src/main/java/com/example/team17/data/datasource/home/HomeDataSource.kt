package com.example.team17.data.datasource.home

import com.example.team17.data.model.response.home.ResMyBoggleData

interface HomeDataSource{
    suspend fun getMyBoggle(): ResMyBoggleData
}