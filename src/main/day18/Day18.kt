package day18

import readInput

fun main() {
    println("Part 1: ${Day18().part1(Day18().input)}")
    println("Part 2: ${Day18().part2(Day18().input)}")
}

class Day18 {
    val input = readInput("resources/day18/data")
    val testInput = readInput("resources/day18/data_test")

    fun part1(input: List<String>): Int = input.size

    fun part2(input: List<String>): Int = input.size
}
