package collections

fun main() {
    val shuffled = listOf(5, 4, 3, 2, 1)
    val natural = shuffled.sorted()
    val inverted = shuffled.sortedBy { -it }

    println("Shuffled: $shuffled")
    println("Natural shuffled: $natural")
    println("Inverted shuffled: $inverted")
}