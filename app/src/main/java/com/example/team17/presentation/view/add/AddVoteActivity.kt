package com.example.team17.presentation.view.add

import android.os.Bundle
import android.util.Log
import com.example.team17.R
import com.example.team17.databinding.ActivityAddBoggleBinding
import com.example.team17.databinding.ActivityAddVoteBinding
import com.example.team17.presentation.base.BaseActivity

class AddVoteActivity : BaseActivity<ActivityAddVoteBinding>(R.layout.activity_add_vote) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.btnNext.setOnClickListener {
            //TODO: POST 서버 연결
            finish()
        }
    }
}