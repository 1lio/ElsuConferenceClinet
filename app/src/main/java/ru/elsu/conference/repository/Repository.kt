package ru.elsu.conference.repository

class Repository {

    companion object {
        fun getInstance() = FakeRepository() // Fake
    }
}