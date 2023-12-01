package day24

import readInput

fun main() {
    println("Part 1: ${Day24().part1(Day24().input)}")
    println("Part 2: ${Day24().part2(Day24().input)}")
}

class Day24 {
    val input = readInput("resources/day24/data")
    val testInput = readInput("resources/day24/data_test")

    fun part1(input: List<String>): Int = input.size

    fun part2(input: List<String>): Int = input.size
}
