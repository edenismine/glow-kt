package com.globant.kotlin.model

import java.time.LocalDate

/**
 * A simple User DTO
 */
data class User(
    /** User name */
    var name: String,
    /** User birthday */
    var birthday: LocalDate
)
