package collections

fun main() {
    val numbers = listOf(1, 2, 3)
    val empty = emptyList<Int>()

    println("Numbers: $numbers, min = ${numbers.min()}, max = ${numbers.max()}")
    println("Empty: $empty, min = ${empty.min()}, max = ${empty.max()}")
}