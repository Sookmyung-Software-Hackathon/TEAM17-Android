package com.example.team17.data.repository.home

import com.example.team17.data.datasource.home.HomeDataSource
import com.example.team17.data.mapper.HomeMapper
import com.example.team17.domain.model.home.MyBoggleInfo
import com.example.team17.domain.repository.HomeRepository

class HomeRepositoryImpl(private val homeDataSource: HomeDataSource): HomeRepository {
    override suspend fun getMyBoggle(): List<MyBoggleInfo> {
        return HomeMapper.mapperToMyBoggleListData(homeDataSource.getMyBoggle())
    }
}