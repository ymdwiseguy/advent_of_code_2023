package day04

import readInput

fun main() {
    println("Part 1: ${Day04().part1(Day04().input)}")
    println("Part 2: ${Day04().part2(Day04().input)}")
}

class Day04 {
    val input = readInput("resources/day04/data")
    val testInput = readInput("resources/day04/data_test")

    fun part1(input: List<String>): Long = input.map(::parseInput).sumOf { it.value() }

    fun part2(input: List<String>): Int = input.size

    fun parseInput(s: String): Card =
        s.split("Card ", ": ", " | ").let { parts ->
            Card(
                id = parts[1],
                winners = parts[2].split(" ").mapNotNull { it.toIntOrNull() },
                numbers = parts[3].split(" ").mapNotNull { it.toIntOrNull() },
            )
        }
}

data class Card(
    val id: String,
    val winners: List<Int>,
    val numbers: List<Int>,
) {
    fun value(): Long {
        var winnerCount = 0
        numbers.forEach { number ->
            if (number in winners) {
                winnerCount++
            }
        }
        return when {
            winnerCount == 1 -> 1
            winnerCount > 1 -> 2.power(winnerCount - 1)
            else -> 0
        }
    }
}

private fun Int.power(exponent: Int): Long = if (exponent != 0) {
    this * this.power(exponent - 1)
} else 1
