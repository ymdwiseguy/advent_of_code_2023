package day03

import readInput

fun main() {
    println("Part 1: ${Day03().part1(Day03().input)}")
    println("Part 2: ${Day03().part2(Day03().input)}")
}

class Day03 {
    val input = readInput("resources/day03/data")
    val testInput = readInput("resources/day03/data_test")

    fun part1(input: List<String>): Int = input.size

    fun part2(input: List<String>): Int = input.size
}
