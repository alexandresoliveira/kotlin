package introduction.variables

fun someContidion(): Boolean { return false }

fun main() {
    val a: String = "initial"
    println(a)
    val b: Int = 1
    val c = 3

    // var e: Int
    // println(e) ##Error:(10, 13) Kotlin: Variable 'e' must be initialized

    val d: Int
    if (someContidion()) {
        d = 1
    } else {
        d = 2
    }
    println(d)
}
