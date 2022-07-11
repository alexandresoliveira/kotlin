package collections

val numbersFirstLast = listOf(1, -2, 3, -4, 5, -6)

val firstNumbers = numbersFirstLast.first()
val lastNumbers = numbersFirstLast.last()

val firstEven = numbersFirstLast.first { it % 2 == 0 }
val lastOdd = numbersFirstLast.last { it % 2 != 0 }

val wordsFirstLast = listOf("foo", "bar", "baz", "faz")
val empty = emptyList<String>()

val firstEmpty = empty.firstOrNull()
val lastEmpty = empty.lastOrNull()

val firstF = wordsFirstLast.firstOrNull { it.startsWith("f") }
val firstZ = wordsFirstLast.firstOrNull { it.startsWith("z") }
val lastF = wordsFirstLast.lastOrNull { it.endsWith("f") }
val lastZ = wordsFirstLast.lastOrNull { it.endsWith("z") }

fun main() {
    println("First: $firstNumbers")
    println("Last: $lastNumbers")
    println()
    println("First even: $firstEven")
    println("Last odd: $lastOdd")
    println()
    println()
    println("First empty: $firstEmpty")
    println("Last empty: $lastEmpty")
    println("First F: $firstF")
    println("First Z: $firstZ")
    println("Last F: $lastF")
    println("Last Z: $lastZ")
}