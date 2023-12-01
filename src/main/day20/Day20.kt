package day20

import readInput

fun main() {
    println("Part 1: ${Day20().part1(Day20().input)}")
    println("Part 2: ${Day20().part2(Day20().input)}")
}

class Day20 {
    val input = readInput("resources/day20/data")
    val testInput = readInput("resources/day20/data_test")

    fun part1(input: List<String>): Int = input.size

    fun part2(input: List<String>): Int = input.size
}
