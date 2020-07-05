package ru.elsu.conference.domain.repository

import ru.elsu.conference.domain.model.Event
import ru.elsu.conference.domain.model.Member
import ru.elsu.conference.domain.model.dto.EventDto
import ru.elsu.conference.domain.model.dto.MembersDto

interface AppRepository {

    suspend fun getEvent(): EventDto
    suspend fun getMembers(): MembersDto

    suspend fun saveEvent(event: Event): Long
    suspend fun saveMember(member: Member): Long

}
