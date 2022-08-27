package com.example.team17.presentation.di

import com.example.sobok_android.data.repository.login.request.SignUpRepositoryImpl
import com.example.team17.data.repository.home.HomeRepositoryImpl
import com.example.team17.domain.repository.HomeRepository
import com.example.team17.domain.repository.UserRepository
import org.koin.dsl.module

val repositoryModule = module {

    single<HomeRepository> { HomeRepositoryImpl(get()) }
    single<UserRepository> { SignUpRepositoryImpl(get()) }
}