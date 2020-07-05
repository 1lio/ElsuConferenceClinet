package ru.elsu.conference.domain.model.dto

import com.google.gson.annotations.SerializedName
import ru.elsu.conference.domain.model.Event

data class EventDto(
    @SerializedName("results") val results: ArrayList<Event>
)