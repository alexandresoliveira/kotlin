package scopeFunctions

class PersonAlso(
        var name: String,
        var age: Int,
        var about: String)

fun main() {
    val jake = PersonAlso(name = "Alexandre", age = 30, about = "Android developer")
            .also {
                writeCreationLog(it)
            }
}

fun writeCreationLog(it: PersonAlso) {
    println("A new person ${it.name} was created!")
}
