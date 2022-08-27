package com.example.team17.presentation.view.add

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.team17.databinding.FragmentAddBottomSheetBinding
import com.example.team17.presentation.view.home.adapter.MyBoggleListAdapter
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class AddBottomSheetFragment : BottomSheetDialogFragment() {

    lateinit var _binding: FragmentAddBottomSheetBinding
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAddBottomSheetBinding.inflate(layoutInflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}