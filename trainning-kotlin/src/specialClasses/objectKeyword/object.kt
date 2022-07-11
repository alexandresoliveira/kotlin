package specialClasses.objectKeyword

import java.util.Random

class LuckDispatcher {
    fun getNumber() {
        var objRandom = Random()
        println(objRandom.nextInt(90))
    }
}

fun rentPrice(standerdDays: Int, festivityDays: Int, specialDays: Int): Unit {
    val dayRates = object {
        var standard: Int = 30 * standerdDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }
    val total = dayRates.standard + dayRates.festivity + dayRates.special
    println("Total price: $$total")
}

object DoAuth {
    fun takeParams(username: String, password: String) {
        println("input Auth parameters = $username:$password")
    }
}

class BigBen {
    companion object Bonger {
        fun getBongs(nTimes: Int) {
            for (i in 1..nTimes) {
                print("BONG ")
            }
        }
    }
}

fun main() {
    val d1 = LuckDispatcher()
    val d2 = LuckDispatcher()

    d1.getNumber()
    d2.getNumber()

    rentPrice(10, 2, 1)

    DoAuth.takeParams("alexandre", "123")

    BigBen.getBongs(12)
}