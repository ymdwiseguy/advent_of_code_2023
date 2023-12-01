package day25

import readInput

fun main() {
    println("Part 1: ${Day25().part1(Day25().input)}")
    println("Part 2: ${Day25().part2(Day25().input)}")
}

class Day25 {
    val input = readInput("resources/day25/data")
    val testInput = readInput("resources/day25/data_test")

    fun part1(input: List<String>): Int = input.size

    fun part2(input: List<String>): Int = input.size
}
