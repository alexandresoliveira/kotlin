package collections

val numbersCount = listOf(1, -2, 3, -4, 5, -6)

val totalCount = numbersCount.count()
val evenCount = numbersCount.count { it % 2 == 0 }

fun main() {
    println("Total count: $totalCount")
    println("Even count: $evenCount")
}