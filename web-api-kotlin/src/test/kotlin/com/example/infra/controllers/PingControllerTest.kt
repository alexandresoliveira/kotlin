package com.example.infra.controllers

import com.example.infra.controllers.PingController
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

@WebMvcTest(PingController::class)
class PingControllerTest(
    @Autowired val mockMvc: MockMvc
) {

    @Test
    fun `Check if server is online`() {
        mockMvc
            .perform(MockMvcRequestBuilders.get("/ping"))
            .andExpect(MockMvcResultMatchers.status().isOk)
            .andExpect(MockMvcResultMatchers.content().string("pong"))
    }
}