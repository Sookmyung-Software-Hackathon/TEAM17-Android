package com.example.team17.presentation.view.user

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.team17.MainActivity
import com.example.team17.R
import com.example.team17.databinding.ActivityLoginBinding
import com.example.team17.presentation.base.BaseActivity
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {
    private val signInViewModel : SignInViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.btnLogin.setOnClickListener {
            if(binding.etEmail.text.isNotEmpty() && binding.etPassword.text.isNotEmpty()) {
                signInViewModel.email = binding.etEmail.text.toString()
                signInViewModel.password = binding.etPassword.text.toString()
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }

        binding.tvSignup.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}