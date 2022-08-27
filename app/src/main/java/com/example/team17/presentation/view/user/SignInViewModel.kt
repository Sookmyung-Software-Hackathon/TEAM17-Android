package com.example.team17.presentation.view.user

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.team17.domain.repository.UserRepository
import kotlinx.coroutines.launch
import okhttp3.internal.userAgent

class SignInViewModel(private val userRepository: UserRepository) : ViewModel() {

    private var _email: String = ""
    var email: String = _email

    private var _password: String = ""
    var password: String = _password

    fun postSignIn() = viewModelScope.launch() {
        kotlin.runCatching {

        }
    }

}