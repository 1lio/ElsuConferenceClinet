package ru.elsu.conference.api.model

data class Event(

    val id: String,
    val title: String,
    val icon: String,
    val status: Int = 0,
    val time: String = "00:00",
    val date: String = "01-10-2020",
    val platform: String = "skype",
    val members: Array<Member> = arrayOf(),
    val institute: String = "none",
    val description: String,
    val lifecycle: Array<Int>,
    val duration: String = "00:00:00",
    val stars: Int = 5
)