package collections

fun main() {
    val numbersPartition = listOf(1, -2, 3, -4, 5, -6)
    val evenOddPartition = numbersPartition.partition { it % 2 == 0 }
    val ( positivesPartition, negativesPartition ) = numbersPartition.partition { it > 0 }

    println("Numbers: $numbersPartition")
    println("Even Odd: $evenOddPartition")
    println("Positives: $positivesPartition")
    println("Negatives: $negativesPartition")
}
