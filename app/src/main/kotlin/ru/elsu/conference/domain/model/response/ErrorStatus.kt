package ru.elsu.conference.domain.model.response

// various error status to know what happened if something goes wrong with a repository call

enum class ErrorStatus {
    NO_CONNECTION,
    BAD_RESPONSE,
    TIMEOUT,
    EMPTY_RESPONSE,
    NOT_DEFINED,
    UNAUTHORIZED
}