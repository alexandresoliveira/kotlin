package collections

fun main() {
    val map = mapOf("key" to 42)

    val value1 = map["key"]
    val value2 = map["key2"]

    val value3: Int = map.getValue("key")

    val mapWithDefault = map.withDefault { k -> k.length }
    val value4 = mapWithDefault.getValue("key2")

    try {
        map.getValue("anotherKey")
    } catch (e: NoSuchElementException) {
        println("Message: $e")
    }

    println("Map: $map")
    println("Value1: $value1")
    println("Value2: $value2")
    println("Value3: $value3")
    println()
    println("Map with default: $mapWithDefault")
    println("Value4: $value4")
}