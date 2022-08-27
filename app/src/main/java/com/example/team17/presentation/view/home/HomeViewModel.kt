package com.example.team17.presentation.view.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.team17.domain.model.home.MyBoggleInfo
import com.example.team17.domain.repository.HomeRepository

class HomeViewModel(homeRepository: HomeRepository): ViewModel() {
    private val _myBoggleList = MutableLiveData<List<MyBoggleInfo>>()
    var myBoggleList: LiveData<List<MyBoggleInfo>> = _myBoggleList

    fun initLocalBoggleList() {
        val local: MutableList<MyBoggleInfo> = mutableListOf(MyBoggleInfo("1", "2022년 08월 27일 13시", "테스트1", 6, 5, listOf()))
    }
}