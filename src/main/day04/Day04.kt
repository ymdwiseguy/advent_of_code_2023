package day04

import readInput
import java.math.BigInteger

fun main() {
    println("Part 1: ${Day04().part1(Day04().input)}")
    println("Part 2: ${Day04().part2(Day04().input)}")
}

class Day04 {
    val input = readInput("resources/day04/data")
    val testInput = readInput("resources/day04/data_test")

    fun part1(input: List<String>): Int = input.map(::parseInput).sumOf { it.value() }

    fun part2(input: List<String>): BigInteger {
        return calculateCardCount(input)
    }

    private fun calculateCardCount(input: List<String>): BigInteger {
        var cardCount: BigInteger = BigInteger.ZERO
        val cards: MutableMap<Int, Card> = input.map(::parseInput).associateBy({ it.id }, { it }).toMutableMap()
        cards.values.forEach { card ->
            if (card.valuePt2() > 0) {
                for (i in card.id + 1..card.id + card.valuePt2()) {
                    cards[i]?.count = cards[i]?.count?.add(card.count) ?: BigInteger.ONE
                }
            }
        }
        cards.values.forEach {
            cardCount = cardCount.add(it.count)
        }
        return cardCount
    }

    fun parseInput(s: String): Card =
        s.split("Card ", ": ", " | ").let { parts ->
            Card(
                id = parts[1].trim().toInt(),
                winners = parts[2].split(" ").mapNotNull { it.toIntOrNull() },
                numbers = parts[3].split(" ").mapNotNull { it.toIntOrNull() },
            )
        }
}

data class Card(
    val id: Int,
    val winners: List<Int>,
    val numbers: List<Int>,
    var count: BigInteger = BigInteger.ONE,
) {
    fun value(): Int {
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

    fun valuePt2(): Int {
        var winnerCount = 0
        numbers.forEach { number ->
            if (number in winners) {
                winnerCount++
            }
        }
        return winnerCount
    }
}

private fun Int.power(exponent: Int): Int = if (exponent != 0) {
    this * this.power(exponent - 1)
} else 1
