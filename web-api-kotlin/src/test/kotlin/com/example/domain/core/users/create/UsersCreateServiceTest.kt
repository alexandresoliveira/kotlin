package com.example.domain.core.users.create

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("com.example.domain.core.users.create.UsersCreateServiceTest")
class UsersCreateServiceTest {

    @Test
    fun `should to expected an user is persisted`() {
        val dao = UsersCreateDAOInMemory()
        val sut = UsersCreateService(dao)

        val fakeUserInput = UsersCreateInput(
            name = "Alexandre",
            email = "alexandre@email.com",
            age = 32
        )

        val output = sut.execute(fakeUserInput)

        assertThat(output.id).isNotNull
        assertThat(output.name).isNotNull
        assertThat(output.name).isEqualTo("Alexandre")
        assertThat(output.email).isNotNull
        assertThat(output.email).isEqualTo("alexandre@email.com")
        assertThat(output.age).isNotNull
        assertThat(output.age).isEqualTo(32)

        print(output)
    }
}