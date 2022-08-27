package com.example.team17.presentation.di

import com.example.team17.presentation.view.home.HomeViewModel
import com.example.team17.presentation.view.user.SignInViewModel
import com.example.team17.presentation.view.user.SignUpViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { HomeViewModel(get()) }
    viewModel { SignInViewModel(get()) }
    viewModel { SignUpViewModel(get()) }
}