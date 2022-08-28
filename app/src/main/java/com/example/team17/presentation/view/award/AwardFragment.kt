package com.example.team17.presentation.view.award

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.team17.R
import com.example.team17.databinding.FragmentAwardBinding
import com.example.team17.databinding.FragmentHomeBinding
import com.example.team17.domain.model.award.RankListAdapter
import com.example.team17.domain.model.award.RankListInfo
import com.example.team17.presentation.base.BaseFragment

class AwardFragment : BaseFragment<FragmentAwardBinding>(R.layout.fragment_award) {
    lateinit var rankListAdapter: RankListAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        val localData = listOf<RankListInfo>(
            RankListInfo("보글보글", "", 98, "98"),
            RankListInfo("예진주식회사", "", 80, "80"),
            RankListInfo("최강서버현애", "", 73, "73"),
            RankListInfo("디자인이최고다제인", "", 68, "68"),
            RankListInfo("악덕채영", "", 25, "25"),
            RankListInfo("지글지글", "", 10, "10")
        )

        rankListAdapter = RankListAdapter(localData)

        rankListAdapter.submitList(localData)
        binding.rcvRanking.adapter = rankListAdapter
    }
}