package day19

import readInput

fun main() {
    println("Part 1: ${Day19().part1(Day19().input)}")
    println("Part 2: ${Day19().part2(Day19().input)}")
}

class Day19 {
    val input = readInput("resources/day19/data")
    val testInput = readInput("resources/day19/data_test")

    fun part1(input: List<String>): Int = input.size

    fun part2(input: List<String>): Int = input.size
}
