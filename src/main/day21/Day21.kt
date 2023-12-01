package day21

import readInput

fun main() {
    println("Part 1: ${Day21().part1(Day21().input)}")
    println("Part 2: ${Day21().part2(Day21().input)}")
}

class Day21 {
    val input = readInput("resources/day21/data")
    val testInput = readInput("resources/day21/data_test")

    fun part1(input: List<String>): Int = input.size

    fun part2(input: List<String>): Int = input.size
}
