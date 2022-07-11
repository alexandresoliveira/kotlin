package com.example.infra.controllers.v1.users.create

import com.example.domain.core.ApiService
import com.example.domain.core.users.create.UsersCreateInput
import com.example.domain.core.users.create.UsersCreateOutput
import com.fasterxml.jackson.databind.ObjectMapper
import org.hamcrest.Matchers.hasSize
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.ResultHandler
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*
import java.util.*

@WebMvcTest(UsersCreateController::class)
@DisplayName("com.example.infra.controllers.v1.users.create.UsersCreateControllerTest")
@TestMethodOrder(OrderAnnotation::class)
class UsersCreateControllerTest(
    @Autowired val mockMvc: MockMvc
) {

    @TestConfiguration
    internal class UsersCreateControllerTestConfiguration() {
        @Bean(name = ["UsersCreateService"])
        fun usersCreateService(): ApiService<UsersCreateInput, UsersCreateOutput> {
            return object : ApiService<UsersCreateInput, UsersCreateOutput> {
                override fun execute(input: UsersCreateInput): UsersCreateOutput {
                    return UsersCreateOutput(
                        id = UUID.randomUUID(),
                        name = input.name,
                        email = input.email,
                        age = input.age
                    )
                }
            }
        }
    }

    @Test
    @Order(1)
    fun `should expected an exception when data is invalid`() {
        val requestContent = "{}"

        mockMvc
            .perform(
                post("/v1/users/create")
                    .contentType(MediaType.APPLICATION_JSON_VALUE)
                    .content(requestContent)
            )
            .andExpect(status().isBadRequest)
    }

    @Test
    @Order(2)
    fun `should expected an exception and message error when data is invalid`() {
        val requestContent = "{}"

        mockMvc
            .perform(
                post("/v1/users/create")
                    .contentType(MediaType.APPLICATION_JSON_VALUE)
                    .content(requestContent)
            )
            .andExpect(status().isBadRequest)
            .andExpect(jsonPath("$").isArray)
            .andDo { println() }
    }

    @Test
    @Order(3)
    fun `should expect an user created`() {
        val request = UsersCreateRequest(
            "my name",
            "my.email@email.com",
            32
        )

        val requestContent = ObjectMapper().writeValueAsBytes(request)

        mockMvc
            .perform(
                post("/v1/users/create")
                    .contentType(MediaType.APPLICATION_JSON_VALUE)
                    .content(requestContent)
            )
            .andExpect(status().isCreated)
            .andExpect(header().exists("location"))
            .andExpect(jsonPath("$.id").isNotEmpty)
            .andExpect(jsonPath("$.name").value("my name"))
            .andExpect(jsonPath("$.email").value("my.email@email.com"))
            .andExpect(jsonPath("$.age").value(32))
    }
}