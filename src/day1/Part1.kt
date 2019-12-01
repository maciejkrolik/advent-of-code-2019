package day1

import java.io.File

fun main() {
    var sum = 0
    File("src/day1/input.txt").forEachLine { number -> sum += (number.toInt() / 3) - 2 }
    println(sum)
}