package ru.elsu.conference.data

class Repository {

    companion object {
        fun getInstance() =
            FakeRepository() // Fake
    }
}