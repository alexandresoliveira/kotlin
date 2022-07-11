package com.example.infra.databases.repositories

import com.example.infra.databases.entities.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface UserRepository : JpaRepository<UserEntity, UUID> {
}