package day02

import readInput

fun main() {
    println("Part 1: ${Day02().part1(Day02().input)}")
    println("Part 2: ${Day02().part2(Day02().input)}")
}

class Day02 {
    val input = readInput("resources/day02/data")
    val testInput = readInput("resources/day02/data_test")

    fun part1(input: List<String>): Int = input.size

    fun part2(input: List<String>): Int = input.size
}
