package ru.elsu.conference.api

import retrofit2.Call
import retrofit2.http.*
import ru.elsu.conference.api.model.Event

interface EventsApi {

    // CRUD

    @POST
    fun createEvents()

    @GET("event/{_id}/")
    fun getEvent(@Path("_id") id: String): Call<Event>

    @PUT
    fun updateEvent(id: String)

    @DELETE("_id")
    fun deleteEvent(id: String)


    @GET("events/all")
    fun getAllEvents(): Call<List<Event>>

}