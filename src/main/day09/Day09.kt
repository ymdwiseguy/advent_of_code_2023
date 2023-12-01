package day09

import readInput

fun main() {
    println("Part 1: ${Day09().part1(Day09().input)}")
    println("Part 2: ${Day09().part2(Day09().input)}")
}

class Day09 {
    val input = readInput("resources/day09/data")
    val testInput = readInput("resources/day09/data_test")

    fun part1(input: List<String>): Int = input.size

    fun part2(input: List<String>): Int = input.size
}
