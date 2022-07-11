package introduction.classes

class Customer

class Contact(val id: Int, var email: String) {
    override fun toString(): String {
        return """
            Contact[
                id: $id,
                email: $email 
            ]
        """.trimIndent()
    }
}

fun main() {
    val customer = Customer()

    val contact = Contact(1, "teste@email.com")

    println(contact.id)

    println(contact)
    contact.email = "other@email.com"
    println(contact)
}