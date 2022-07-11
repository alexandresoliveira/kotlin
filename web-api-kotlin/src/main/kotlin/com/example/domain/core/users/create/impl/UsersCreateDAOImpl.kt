package com.example.domain.core.users.create.impl

import com.example.domain.core.users.create.UsersCreateDAO
import com.example.infra.databases.entities.UserEntity
import com.example.infra.databases.repositories.UserRepository
import org.springframework.stereotype.Component

@Component("UsersCreateDAOImpl")
class UsersCreateDAOImpl(
    val userRepository: UserRepository
) : UsersCreateDAO {
    override fun saveUser(user: UserEntity) : UserEntity {
        return userRepository.save(user)
    }
}