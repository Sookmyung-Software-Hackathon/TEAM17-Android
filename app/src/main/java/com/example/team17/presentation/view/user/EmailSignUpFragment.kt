package com.example.team17.presentation.view.user

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.team17.R
import com.example.team17.databinding.FragmentEmailSignUpBinding
import com.example.team17.presentation.base.BaseFragment

class EmailSignUpFragment : BaseFragment<FragmentEmailSignUpBinding>(R.layout.fragment_email_sign_up) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_emailSignUpFragment_to_signUpNicknameFragment)
        }
    }
}