package productivityBoosters

data class UserPB(val username: String, val email: String)

class Pair<K, V>(val first: K, val second: V) {
    operator fun component1(): K {
        return first
    }
    operator fun component2(): V {
        return second
    }
}

fun main() {
    val (x, y, z) = kotlin.arrayOf(5, 10, 15)
    val map = mapOf("Alice" to 21, "Bob" to 25)
    for ((name, age) in map) {
        println("$name is $age years old")
    }
    val (min, max) = findMinMax(listOf(100, 90, 50, 20, 88, 37))
    println("min: $min, max: $max")
    println()
    val user = getUser()
    val (username, email) = user
    println(username == user.component1())
    val (_, emailAddress) = getUser()
    println("email: $emailAddress")
    println()
    val (num, name) = Pair(1, "one")
    println("num = $num, name: $name")
}

fun findMinMax(elements: List<Int>): Pair<Int?, Int?> {
    val min = elements.min()
    val max = elements.max()
    return Pair(min, max)
}

fun getUser() = UserPB("Mary", "mary@email.com")
