package introduction.functions

fun printAll(vararg messages: String) {
    for (m in messages) println(m)
}

fun printAllWithPrefix(vararg messages: String, prefix: String) {
    for (m in messages) println("$m $prefix")
}

fun log(vararg entries: String) {
    printAll(*entries)
}

fun main() {
    printAll("Hello", "Olá", "Hola", "Salut")

    printAllWithPrefix("Hello", "Olá", "Hola", "Salut", prefix = "Alexandre")
}
