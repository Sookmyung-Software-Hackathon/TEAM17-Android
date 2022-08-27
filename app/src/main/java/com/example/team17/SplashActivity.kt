package com.example.team17

import android.content.Intent
import android.os.Bundle
import com.example.team17.databinding.ActivitySplashBinding
import com.example.team17.presentation.base.BaseActivity
import com.example.team17.presentation.view.user.SignUpActivity

class SplashActivity : BaseActivity<ActivitySplashBinding>(R.layout.activity_splash) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.btnNext.setOnClickListener {
            startActivity(Intent(this@SplashActivity, SignUpActivity::class.java))
        }
    }
}