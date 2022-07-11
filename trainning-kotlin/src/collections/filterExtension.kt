package collections

val numbers = listOf(1, -2, 3, -4, 5, -6)
val positives = numbers.filter { x -> x > 0 }
val negatives = numbers.filter { it < 0 }

fun main() {
    println("positives: $positives")
    println("negatives: $negatives")
}