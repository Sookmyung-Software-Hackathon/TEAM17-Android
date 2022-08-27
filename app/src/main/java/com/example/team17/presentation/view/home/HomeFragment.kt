package com.example.team17.presentation.view.home

import android.os.Bundle
import android.view.View
import com.example.team17.R
import com.example.team17.databinding.FragmentHomeBinding
import com.example.team17.presentation.base.BaseFragment
import com.example.team17.presentation.view.home.adapter.MyBoggleListAdapter
import com.example.team17.presentation.view.home.adapter.VoteListAdapter

class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {
    private lateinit var addMyBoggleAdapter: MyBoggleListAdapter
    private lateinit var addVoteAdapter: VoteListAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        addMyBoggleAdapter = MyBoggleListAdapter()
        addVoteAdapter = VoteListAdapter()

        // TODO : 뷰모델 리스트 넣어주기~
        //addVoteAdapter.submitList()

        binding.rcvMyBoggle.adapter = addMyBoggleAdapter
        binding.rcvVote.adapter = addVoteAdapter
    }
}