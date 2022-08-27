package com.example.team17.data.mapper

import com.example.team17.data.model.response.home.ResMyBoggleData
import com.example.team17.domain.model.home.MyBoggleInfo

object HomeMapper {
    fun mapperToMyBoggleListData(resMyBoggleData: ResMyBoggleData): List<MyBoggleInfo> {
        return resMyBoggleData.data.map {
            MyBoggleInfo(
                id = it.id,
                date = it.date_time,
                title = it.title,
                totalPerson = it.max_person,
                currentPerson = it.current_person
            )
        }
    }
}