package scopeFunctions

class Person(
        var name: String = "a",
        var age: Int = 10,
        var about: String = "teste") {
    override fun toString(): String {
        return """
            Person [
                name: $name,
                age: $age,
                about: $about
            ]
        """.trimIndent()
    }
}

fun main() {
    val jake = Person()
    val stringDescriptor = jake.apply {
        this.name = "Jake"
        this.age = 30
        this.about = "Android developer"
    }.toString()
    println(stringDescriptor)
}