package com.example.infra.databases.entities

import java.util.*
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "users")
data class UserEntity(
    val name: String,
    val email: String,
    val age: Int
) : BaseEntity<UUID>()