package com.example.infra.databases.repositories

import com.example.infra.databases.entities.UserEntity
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.test.context.TestPropertySource

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE, connection = EmbeddedDatabaseConnection.H2)
@TestPropertySource(locations = ["classpath:application-tst.yml"])
class UserRepositoryTest(
    @Autowired val userRepository: UserRepository
) {

    @Test
    fun `should objects is not null`() {
        assertThat(userRepository).isNotNull
    }

    @Test
    fun `should expected a user has created`() {
        val userEntity = UserEntity(
            name = "fake name",
            email = "fake@email.com",
            age = 32
        )

        val savedUser = userRepository.save(userEntity)

        assertThat(savedUser.id).isNotNull
        assertThat(savedUser.name).isEqualTo("fake name")
    }
}