package day23

import readInput

fun main() {
    println("Part 1: ${Day23().part1(Day23().input)}")
    println("Part 2: ${Day23().part2(Day23().input)}")
}

class Day23 {
    val input = readInput("resources/day23/data")
    val testInput = readInput("resources/day23/data_test")

    fun part1(input: List<String>): Int = input.size

    fun part2(input: List<String>): Int = input.size
}
