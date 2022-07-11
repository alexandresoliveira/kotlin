package collections

fun main() {
    val list = listOf(0, 10, 20)

    println("Get or else list element: ${list.getOrElse(1) { 42 }}")
    println("Get or else list undefined element: ${list.getOrElse(10) { 42 }}")

    val map = mutableMapOf<String, Int?>()

    println("Get or else map undefined element: ${map.getOrElse("x") { 30 }}")

    map["x"] = 30
    println("Get or else map element: ${map.getOrElse("x") { 31 }}")

    map["x"] = null
    println("Get or else map null element: ${map.getOrElse("x") { 32 }}")
}