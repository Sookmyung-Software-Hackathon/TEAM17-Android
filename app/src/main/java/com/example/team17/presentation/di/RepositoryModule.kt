package com.example.team17.presentation.di

import com.example.sobok_android.data.repository.login.request.SignUpRepositoryImpl
import com.example.team17.domain.repository.UserRepository
import org.koin.dsl.module

val repositoryModule = module {

    single<UserRepository> { SignUpRepositoryImpl(get()) }
}