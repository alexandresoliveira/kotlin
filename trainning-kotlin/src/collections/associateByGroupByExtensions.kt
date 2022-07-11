package collections

data class Person(
        val name: String,
        val city: String,
        val phone: String)

val people = listOf(
        Person("Jhon", "Boston", "0192380192831"),
        Person("Sarah", "Belo Horizonte", "923748743213"),
        Person("Juan", "Madrid", "23980923843"),
        Person("Carlo", "Milan", "476328283746"))

val phoneBook = people.associateBy { it.phone }
val cityBook = people.associateBy(Person::phone, Person::city)
val peopleCities = people.groupBy(Person::city, Person::name)

fun main() {
    println("Phone book: $phoneBook")
    println("City book: $cityBook")
    println("People book: $peopleCities")
}
