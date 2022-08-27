package com.example.team17.presentation.view.user

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.team17.data.model.request.user.ReqSignUpSuccessData
import com.example.team17.domain.repository.UserRepository
import kotlinx.coroutines.launch

class SignUpViewModel(private val signUpRepository: UserRepository): ViewModel() {
    private var _email = ""
    var email: String = _email

    private var _pw = ""
    var pw: String = _pw

    private var _nickname = ""
    var nickname: String = _nickname

    private var _birthYear = 2000
    var birth_year: Int = _birthYear

    private var _teamId = ""
    var team_id: String = _teamId

    fun postSignUp() = viewModelScope.launch() {
        kotlin.runCatching {
            signUpRepository.postSignUpResult(ReqSignUpSuccessData(_email, _pw, _nickname, _birthYear, _teamId))
        }.onSuccess {

        }
    }
}