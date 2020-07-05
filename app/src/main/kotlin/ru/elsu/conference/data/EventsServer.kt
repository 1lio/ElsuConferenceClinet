package ru.elsu.conference.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class EventsServer {

    private var service: EventsApi? = null

    private companion object{
        // Тестил на локальном хосте. Скачать проект с сервером https://github.com/1lio/ELSU-CONF
        const val BASE_URL = "127.0.0.1/api/"
    }


    init {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        service = retrofit.create(EventsApi::class.java)
    }

}