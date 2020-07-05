package ru.elsu.conference.data

data class Member(
    val id: String,
    val name: String,
    val icon: String,
    val skype: String,
    val phone: String,
    val mail: String,
    val timeZone: String = "+3",
    val assistant: String
)