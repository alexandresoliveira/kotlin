package collections

val numbersMap = listOf(1, -2, 3, -4, 5, -6)
val doubled = numbersMap.map { x -> x * 2 }
val tripled = numbersMap.map { it * 3 }

fun main() {
    println("doubled: $doubled")
    println("tripled: $tripled")
}