package ru.elsu.conference.domain.model.dto

import com.google.gson.annotations.SerializedName
import ru.elsu.conference.domain.model.Member

data class MembersDto(
    @SerializedName("results") val results: ArrayList<Member>
)