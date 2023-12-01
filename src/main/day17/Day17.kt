package day17

import readInput

fun main() {
    println("Part 1: ${Day17().part1(Day17().input)}")
    println("Part 2: ${Day17().part2(Day17().input)}")
}

class Day17 {
    val input = readInput("resources/day17/data")
    val testInput = readInput("resources/day17/data_test")

    fun part1(input: List<String>): Int = input.size

    fun part2(input: List<String>): Int = input.size
}
