package introduction.generics

fun <E> mutableStackOf(vararg elemets: E) = MutableStack(*elemets)

fun main() {
    val stack = mutableStackOf(0.62, 3.14, 2.7)
    println(stack)
}