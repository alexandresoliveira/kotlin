package com.example.domain.core.users.create

import java.util.*

data class UsersCreateOutput(
    val id: UUID,
    val name: String,
    val email: String,
    val age: Int
)