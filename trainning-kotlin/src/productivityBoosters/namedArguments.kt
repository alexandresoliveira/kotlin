package productivityBoosters

fun format(userName: String, domain: String): String {
    return "userName: $userName, domain: $domain"
}

fun main() {
    println(format("mario", "example.com"))
    println(format("domain.com", "silvio"))
    println(format(userName = "maria", domain = "maria.com"))
    println(format(domain = "alexandre.com", userName = "alexandre"))
}
