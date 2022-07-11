package com.example.domain.core.users.create

import com.example.domain.core.ApiService
import com.example.infra.databases.entities.UserEntity
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

@Service("UsersCreateService")
class UsersCreateService(
    @Qualifier("UsersCreateDAOImpl") val dao: UsersCreateDAO
) : ApiService<UsersCreateInput, UsersCreateOutput> {

    override fun execute(input: UsersCreateInput): UsersCreateOutput {
        var entity = UserEntity(
            name = input.name,
            email = input.email,
            age = input.age
        )

        val saveUser = dao.saveUser(entity)

        return UsersCreateOutput(
            saveUser.id!!,
            saveUser.name,
            saveUser.email,
            saveUser.age
        )
    }
}