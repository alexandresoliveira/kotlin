package controlFlow.whenStatement

fun main() {
    println(whenAssign("Hello"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(MyClass()))
}

fun whenAssign(obj: Any) : Any {
    val result = when {
        obj == 1 -> "One"
        obj == "Hello" -> 1
        obj is Long -> false
        else -> 42
    }
    return result
}