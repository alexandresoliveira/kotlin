package com.example.domain.core.users.create

import com.example.infra.databases.entities.UserEntity
import java.time.LocalDateTime
import java.util.*

class UsersCreateDAOInMemory : UsersCreateDAO {
    private val users: Array<UserEntity> = arrayOf()

    override fun saveUser(user: UserEntity) : UserEntity {
        user.id = UUID.randomUUID()
        user.createdAt = LocalDateTime.now()
        user.updatedAt = LocalDateTime.now()
        user.version = LocalDateTime.now()

        users.plus(user)

        return user
    }
}