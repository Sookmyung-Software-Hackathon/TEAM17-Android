package com.example.team17.data.model.response.home

data class ResMyBoggleData(
    val data: List<MyBoggleInfo>,
    val message: String,
    val status: Int
) {
    data class MyBoggleInfo(
        val anonymity: Boolean,
        val current_person: Int,
        val date_time: String,
        val id: String,
        val max_person: Int,
        val success: Boolean,
        val tag: String?,
        val title: String
    )
}