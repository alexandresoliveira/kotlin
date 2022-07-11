package controlFlow.equalityChecks

val authors = setOf("Shakespeare", "Hemingway", "Twain")
var writers = setOf("Twain", "Shakespeare", "Hemingway")

fun main() {
    println("Structural comparison: ${authors == writers}")
    println("Referential comparison: ${authors === writers}")
}