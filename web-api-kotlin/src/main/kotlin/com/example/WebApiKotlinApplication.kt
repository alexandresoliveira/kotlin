package com.example

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebApiKotlinApplication

fun main(args: Array<String>) {
    runApplication<WebApiKotlinApplication>(*args) {
        setBannerMode(Banner.Mode.OFF)
    }
}

