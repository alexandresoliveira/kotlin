package introduction.functions

fun printMessage(message: String) {
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] - $message")
}

fun sum(x: Int, y: Int): Int {
    return x + y;
}

fun multiply(x: Int, y: Int) = x * y

fun main() {
    printMessage("Teste")
    printMessageWithPrefix("Sem prefixo padrão", "Olha o prefixo")
    printMessageWithPrefix("Com prefixo padrão")
    printMessageWithPrefix(prefix = "Misturando a ordem dos", message = "Parametros")
    println(sum(1, 2))
    println(multiply(3,4))
}