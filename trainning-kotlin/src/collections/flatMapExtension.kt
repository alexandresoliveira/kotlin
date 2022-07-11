package collections

fun main() {
    val numbers = listOf(1, 2, 3)
    val tripled = numbers.flatMap { listOf(it, it, it) }
    println("Numbers: $numbers")
    println("Tripled: $tripled")
}