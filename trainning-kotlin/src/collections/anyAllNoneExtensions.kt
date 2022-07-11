package collections

val numbersAnyAllNone = listOf(1, -2, 3, -4, 5, -6)
val anyNegatve = numbersAnyAllNone.any { it < 0 }
val anyGreaterThanSix = numbersAnyAllNone.any { it > 6 }

val allEven = numbersAnyAllNone.all { it % 2 == 0 }
val allLessSix = numbersAnyAllNone.all { it < 6 }

val noneEven = numbersAnyAllNone.none { it % 2 == 1 }
val noneLessSix = numbersAnyAllNone.none { it > 6 }

fun main() {
    println("### Any")
    println("Negative: $anyNegatve")
    println("Greater than Six: $anyGreaterThanSix")
    println()
    println("### All")
    println("All even: $allEven")
    println("All less six: $allLessSix")
    println()
    println("### None")
    println("None even: $noneEven")
    println("None less six: $noneLessSix")
}
