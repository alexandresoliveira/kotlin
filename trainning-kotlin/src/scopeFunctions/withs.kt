package scopeFunctions

fun main() {
    var configuration = object {
        val host: String = "127.0.0.1"
        val port: String = "8080"
    }

    with(configuration) {
        println("$host:$port")
    }

    println("${configuration.host}:${configuration.port}")
}