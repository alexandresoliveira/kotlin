package scopeFunctions

fun customPrint(msg: String) {
    print(msg)
}

fun printNonNull(str: String?) {
    println("Printing \"$str\":")
    str?.let {
        print("\t")
        customPrint(it)
        println()
    }
}

fun main() {
    val empty = "test".let {
        customPrint(it)
        it.isEmpty()
    }

    println(" is empty: $empty")

    printNonNull(null)
    printNonNull("My string")
}