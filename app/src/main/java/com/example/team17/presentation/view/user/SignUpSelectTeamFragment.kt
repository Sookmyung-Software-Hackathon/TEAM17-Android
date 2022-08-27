package com.example.team17.presentation.view.user

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.team17.MainActivity
import com.example.team17.R
import com.example.team17.databinding.FragmentSignUpSelectTeamBinding
import com.example.team17.presentation.base.BaseFragment

class SignUpSelectTeamFragment :
    BaseFragment<FragmentSignUpSelectTeamBinding>(R.layout.fragment_sign_up_select_team) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.ivSearch.setOnClickListener {

        }

        binding.btnSave.setOnClickListener {
            val intent = Intent(activity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}