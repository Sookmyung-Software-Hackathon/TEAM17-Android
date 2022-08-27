package com.example.team17.presentation.di

import com.example.team17.data.datasource.user.UserDataSource
import com.example.team17.data.datasource.user.UserRemoteDataSource
import org.koin.dsl.module

val dataSourceModule = module {

    single<UserDataSource> { UserRemoteDataSource(get()) }
}