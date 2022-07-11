package introduction.functions

fun main() {

    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Teste ")

    val pair = "Ferrari" to "Lamborghini"
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "Lewis" onto "Hamilton"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia
}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) { likedPeople.add(other) }
}