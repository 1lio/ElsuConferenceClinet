package ru.elsu.conference.repository

import ru.elsu.conference.api.model.Event
import ru.elsu.conference.api.model.Member

class FakeRepository {

    private val memberElsu = Member(
        id = "elsu123",
        icon = "elsu.png",
        mail = "test@test.tu",
        name = "ELSU",
        phone = "+79554789776",
        timeZone = "+3",
        skype = "Bayan",
        assistant = "TESTER"
    )

    fun getEventsList(): List<Event> {

        val status1 = Event(
            id = "kd12ds1",
            date = "12.07.12",
            description = "фейк событие",
            duration = "00:11",
            icon = "elsu",
            time = "12:00",
            platform = "skype",
            institute = "Imeit",
            stars = 5,
            status = 1,
            title = "Событие началось",
            lifecycle = arrayOf(0),
            members = arrayOf(memberElsu)
        )

        val status2 = Event(
            id = "kd12ds2",
            date = "",
            description = "status2",
            duration = "dsf",
            icon = "",
            time = "",
            platform = "mind",
            institute = "Imeit",
            stars = 6,
            status = 2,
            title = "Событие Запланированно",
            lifecycle = arrayOf(0),
            members = arrayOf(memberElsu)
        )


        val status3 = Event(
            id = "kd12ds3",
            date = "",
            description = "status2",
            duration = "dsf",
            icon = "",
            time = "",
            platform = "mind",
            institute = "Imeit",
            stars = 6,
            status = 3,
            title = "Событие Перенесено",
            lifecycle = arrayOf(0),
            members = arrayOf(memberElsu)
        )


        val status4 = Event(
            id = "kd12ds4",
            date = "",
            description = "status2",
            duration = "dsf",
            icon = "",
            time = "",
            platform = "mind",
            institute = "Imeit",
            stars = 6,
            status = 4,
            title = "Событие Отменено",
            lifecycle = arrayOf(0),
            members = arrayOf(memberElsu)
        )


        val status5 = Event(
            id = "kd12ds5",
            date = "",
            description = "status2",
            duration = "dsf",
            icon = "",
            time = "",
            platform = "mind",
            institute = "Imeit",
            stars = 6,
            status = 5,
            title = "Событие Завершено",
            lifecycle = arrayOf(0),
            members = arrayOf(memberElsu)
        )



        return arrayListOf(status1, status2, status3, status4, status5)
    }

}