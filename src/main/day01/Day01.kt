package day01

import readInput

fun main() {
    println("Part 1: ${Day01().part1(Day01().input)}")
    println("Part 2: ${Day01().part2(Day01().input)}")
}

class Day01 {
    val input = readInput("resources/day01/data")
    val testInput = readInput("resources/day01/data_test")

    fun part1(input: List<String>): Int = input.size

    fun part2(input: List<String>): Int = input.size
}
