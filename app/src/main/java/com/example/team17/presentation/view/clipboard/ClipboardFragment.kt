package com.example.team17.presentation.view.clipboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.team17.R
import com.example.team17.databinding.FragmentClipboardBinding
import com.example.team17.databinding.FragmentHomeBinding
import com.example.team17.domain.model.home.MyBoggleInfo
import com.example.team17.presentation.base.BaseFragment

class ClipboardFragment : BaseFragment<FragmentClipboardBinding>(R.layout.fragment_clipboard) {
    lateinit var boggleListAdapter: BoggleListAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val local: List<MyBoggleInfo> =
            listOf(
                MyBoggleInfo("1", "2022년 08월 29일 12시", "중국집 점심 식사", 6, 5),
                MyBoggleInfo("1", "2022년 08월 30일 18시", "곱창 구이", 6, 5),
                MyBoggleInfo("1", "2022년 08월 29일 18시", "스프링 모각코", 6, 3),
                MyBoggleInfo("1", "2022년 08월 29일 22시", "TIL", 6, 5),
                MyBoggleInfo("1", "2022년 08월 31일 12시", "한식당 점심 식사", 6, 5)
            )

        boggleListAdapter = BoggleListAdapter(local)
        boggleListAdapter.submitList(local)
        binding.rcvTagList.adapter = boggleListAdapter

        binding.tvChip1.setOnClickListener {
            binding.tvChip1.isSelected = !binding.tvChip1.isSelected == true
        }
        binding.tvChip2.setOnClickListener {
            binding.tvChip2.isSelected = !binding.tvChip2.isSelected == true
        }
        binding.tvChip3.setOnClickListener {
            binding.tvChip3.isSelected = !binding.tvChip3.isSelected == true
        }
        binding.tvChip4.setOnClickListener {
            binding.tvChip4.isSelected = !binding.tvChip4.isSelected == true
        }

    }
}