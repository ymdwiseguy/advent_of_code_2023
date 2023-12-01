package day16

import readInput

fun main() {
    println("Part 1: ${Day16().part1(Day16().input)}")
    println("Part 2: ${Day16().part2(Day16().input)}")
}

class Day16 {
    val input = readInput("resources/day16/data")
    val testInput = readInput("resources/day16/data_test")

    fun part1(input: List<String>): Int = input.size

    fun part2(input: List<String>): Int = input.size
}
