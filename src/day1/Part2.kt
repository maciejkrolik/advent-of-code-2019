package day1

import java.io.File

fun main() {
    var sum = 0
    File("src/day1/input.txt").forEachLine { number ->
        var fuel = number.toInt()
        do {
            fuel = calcFuel(fuel)
            sum += fuel
        } while (fuel > 0)
    }
    println(sum)
}

fun calcFuel(number: Int): Int {
    val fuel = (number / 3) - 2
    return if (fuel > 0) fuel else 0
}