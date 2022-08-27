package com.example.team17.data.datasource.home

import com.example.team17.data.api.HomeService
import com.example.team17.data.model.response.home.ResMyBoggleData

class HomeRemoteDataSource(private val homeService: HomeService): HomeDataSource {
    override suspend fun getMyBoggle(): ResMyBoggleData = homeService.getMyBoggle("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlbWFpbEBnb29nbGUuY29tIiwicm9sZXMiOlsiUk9MRV9VU0VSIl0sImlhdCI6MTY2MTYyODU0MiwiZXhwIjoxNjYxNjcxNzQyfQ.AQxhPJOw1nmgw_DJkdUYTNdC-caSXQLbmRLddxk1Rq8")
}