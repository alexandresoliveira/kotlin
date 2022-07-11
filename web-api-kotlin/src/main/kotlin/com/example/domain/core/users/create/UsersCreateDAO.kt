package com.example.domain.core.users.create

import com.example.infra.databases.entities.UserEntity

interface UsersCreateDAO {

    fun saveUser(user: UserEntity) : UserEntity
}