package introduction.generics

class MutableStack<E>(vararg items: E) {
    private val elements = items.toMutableList()
    fun push(element: E) = elements.add(element)
    fun peek(): E = elements.last()
    fun pop(): E = elements.removeAt(elements.size - 1)
    fun isEmpty() = elements.isEmpty()
    fun size() = elements.size
    override fun toString() = "MutableStack(${elements.joinToString()})"
}

fun main() {
    val mutable = MutableStack(0.62, 3.14, 2.7, 9.87)
    println(mutable)
    println("isEmpty: ${mutable.isEmpty()}")
    println("peek: ${mutable.peek()}")
    println(mutable)
    println("pop: ${mutable.pop()}")
    println(mutable)
    println("pop: ${mutable.pop()}")
    println(mutable)
    println("pop: ${mutable.pop()}")
    println(mutable)
    println("pop: ${mutable.pop()}")
    println(mutable)
    println("isEmpty: ${mutable.isEmpty()}")
}