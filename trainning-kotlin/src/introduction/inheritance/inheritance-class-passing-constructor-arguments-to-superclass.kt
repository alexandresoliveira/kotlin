package introduction.inheritance

open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

class AsiaticLion(name: String): Lion(name = name, origin = "India")

fun main() {
    val lion: Lion = AsiaticLion("Rufo")
    lion.sayHello()
}