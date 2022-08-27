package com.example.team17.presentation.view.user

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.example.team17.R
import com.example.team17.databinding.ActivitySignUpBinding
import com.example.team17.presentation.base.BaseActivity

class SignUpActivity : BaseActivity<ActivitySignUpBinding>(R.layout.activity_sign_up) {
    private lateinit var navController: NavController
    private var emailSignUpFragment: EmailSignUpFragment = EmailSignUpFragment()
    private var signUpNicknameFragment: SignUpNicknameFragment = SignUpNicknameFragment()
    private var signUpSelectTeamFragment: SignUpSelectTeamFragment = SignUpSelectTeamFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        emailSignUpFragment = EmailSignUpFragment()
        signUpNicknameFragment = SignUpNicknameFragment()
        signUpSelectTeamFragment = SignUpSelectTeamFragment()
        
    }


    override fun onSupportNavigateUp() = findNavController(R.id.nav_signup).navigateUp()
}