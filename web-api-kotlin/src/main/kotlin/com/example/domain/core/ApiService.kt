package com.example.domain.core

interface ApiService<I, O> {
    fun execute(input: I): O
}