package ru.elsu.conference.data

import ru.elsu.conference.domain.model.Event
import ru.elsu.conference.domain.model.Member

// Для ручного тестирования

class FakeRepository {

    private val memberEGU = Member(
        id = "elsu123",
        icon = "elsu",
        mail = "main@elsu.ru",
        name = "Федеральное государственное бюджетное образовательное учреждение высшего образования «Елецкий государственный университет им. И.А. Бунина»",
        phone = "+79554789776",
        timeZone = "+3",
        skype = "elsu",
        assistant = "TESTER"
    )

    private val memberAGTU = Member(
        id = "agt123",
        icon = "agtu",
        mail = "main@agtu.ru",
        name = "Федеральное государственное бюджетное образовательное учреждение высшего образования «Астраханский государственный технический университет»",
        phone = "+79554789776",
        timeZone = "+3",
        skype = "elsu",
        assistant = "TESTER"
    )

    private val memberMGU = Member(
        id = "emhu123",
        icon = "msuo",
        mail = "main@mguo.ru",
        name = "Национальный исследовательский Мордовский государственный университет имени Н. П. Огарёва",
        phone = "+79554789776",
        timeZone = "+3",
        skype = "elsu",
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
            members = arrayOf(memberEGU)
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
            members = arrayOf(memberEGU)
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
            members = arrayOf(memberEGU)
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
            members = arrayOf(memberEGU)
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
            members = arrayOf(memberEGU)
        )



        return arrayListOf(status1, status2, status3, status4, status5)
    }

    fun getMembers(): List<Member> = arrayListOf(memberEGU, memberAGTU, memberMGU)
}