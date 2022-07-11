package com.example.infra.controllers

import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class PingController {

    @GetMapping(value = ["ping"], produces = [MediaType.TEXT_PLAIN_VALUE])
    fun handle(): ResponseEntity<String> {
        return ResponseEntity.ok("pong");
    }
}