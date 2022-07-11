package introduction.nulls

fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length: ${maybeString.length}"
    }
    return "Empyt or null string"
}

fun main() {
    println(describeString("String with contents"))
    println(describeString(null))
}