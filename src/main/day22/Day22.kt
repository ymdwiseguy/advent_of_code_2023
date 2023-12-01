package day22

import readInput

fun main() {
    println("Part 1: ${Day22().part1(Day22().input)}")
    println("Part 2: ${Day22().part2(Day22().input)}")
}

class Day22 {
    val input = readInput("resources/day22/data")
    val testInput = readInput("resources/day22/data_test")

    fun part1(input: List<String>): Int = input.size

    fun part2(input: List<String>): Int = input.size
}
