package com.example.team17.presentation.view.home

import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.team17.R
import com.example.team17.databinding.FragmentHomeBinding
import com.example.team17.domain.model.home.MyBoggleInfo
import com.example.team17.domain.model.home.VoteBoggleInfo
import com.example.team17.presentation.base.BaseFragment
import com.example.team17.presentation.view.home.adapter.MyBoggleListAdapter
import com.example.team17.presentation.view.home.adapter.VoteListAdapter
import com.example.team17.presentation.view.user.SignInViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {
    private lateinit var addMyBoggleAdapter: MyBoggleListAdapter
    private lateinit var addVoteAdapter: VoteListAdapter
    //private val homeViewModel : HomeViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val local: List<MyBoggleInfo> =
            listOf(
                MyBoggleInfo("1", "2022년 08월 29일 12시", "중국집 점심 식사", 6, 5),
                MyBoggleInfo("1", "2022년 08월 30일 18시", "곱창 구이", 6, 5)
            )

        val voteLocal: List<VoteBoggleInfo> =
            listOf(
                VoteBoggleInfo("워크샵 장소 어디?", "23", "56", listOf("가평", "롯데월드", "강릉")),
                VoteBoggleInfo("회식 메뉴 어떤거?", "3", "80", listOf("회", "돼지고기", "치킨")),
                VoteBoggleInfo("주말 등산 참여 하실분?", "12", "23", listOf("참여", "미참여", "참여율 보고 결정"))
            )
        addMyBoggleAdapter = MyBoggleListAdapter(local)
        addVoteAdapter = VoteListAdapter(voteLocal)

        // TODO : 뷰모델 리스트 넣어주기~
//        addVoteAdapter.submitList()
//        addMyBoggleAdapter.submitList(homeViewModel.myBoggleList.value)

        //addMyBoggleAdapter.submitList(homeViewModel.myBoggleList.value)



        Log.d("local list", "$local")
        addMyBoggleAdapter.submitList(local)
        addVoteAdapter.submitList(voteLocal)
        binding.rcvMyBoggle.adapter = addMyBoggleAdapter
        binding.rcvVote.adapter = addVoteAdapter




    }
}