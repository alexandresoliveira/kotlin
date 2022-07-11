package controlFlow.lops

val cakes = listOf("carrot", "cheese", "chocolate")

fun eatACake(cake: String) = println("Eat a cake: $cake")
fun bakeACake(cake: String) = println("Bake a cake: $cake")

class Animal(val name: String)

class Zoo(val animals: List<Animal>) {
    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()
    }
}

fun main() {
    println("### for ###")
    for (cake in cakes) {
        println("Avaiable cake: $cake")
    }
    println(" ")
    println("### while and do-while ###")
    var cakesEaten = 0
    var cakesBaket = 0
    while (cakesEaten < 3) {
        eatACake(cakes.get(cakesEaten))
        cakesEaten++
    }
    do {
        bakeACake(cakes[cakesBaket])
        cakesBaket++
    } while (cakesBaket < cakesEaten)
    println(" ")
    println("### iterator ###")
    val zoo = Zoo(listOf(Animal("Zebra"), Animal("Lion")))
    for (animal in zoo) {
        println("Watch out, it's a ${animal.name}")
    }
}