package collections

val openIssues: MutableSet<String> = mutableSetOf(
        "uniqueDescr1",
        "uniqueDescr2",
        "uniqueDescr3"
)

fun addIssue(uniqueDesc: String) : Boolean {
    return openIssues.add(uniqueDesc)
}

fun getStatusLog(isAdded: Boolean) : String {
    return if (isAdded) "registered correctly." else "marked as duplicate and rejected."
}

fun main() {
    val aNewIssue: String = "uniqueDescr4"
    val anIssueAlreadIn: String = "uniqueDescr2"

    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")
    println("Issue $anIssueAlreadIn ${getStatusLog(addIssue(anIssueAlreadIn))}")
}