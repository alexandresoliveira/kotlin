package introduction.nulls

fun strLength(notNull: String): Int {
    return notNull.length
}

fun main() {
    var neverNull: String = "This can't be null"
    // neverNull = null

    var nullable: String? = "You can keep a null here"
    nullable = null

    var inferredNonNull = "The compiler assumes non-null"
    // inferredNonNull = null

    println(strLength(neverNull))
    // println(strLength(nullable))
}