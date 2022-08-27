package com.example.team17.domain.model.home

data class MyBoggleInfo(
    val id: String,
    val date: String,
    val title: String,
    val totalPerson: Int,
    val currentPerson: Int,
    val image: List<String>
)
