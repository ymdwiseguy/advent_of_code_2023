package day01

import println
import readInput

fun main() {
    println("Part 2: ${Day01().part2(Day01().input)}")
}

class Day01 {
    val input = readInput("resources/day01/data")
    val testInput = readInput("resources/day01/data_test")
    val allNumbers = listOf("one", "two", "three", "four", "five", "six", "seven", "eight", "nine")

    fun part2(input: List<String>): Int = input.sumOf {
        val rowValue = getCalibrationValue(it) ?: 0
        rowValue.println()
        rowValue
    }

    fun getAllNumbers(input: String): String {
        val indexedNumbers = buildMap {
            input.forEachIndexed { index, char ->
                if (char.isDigit()) {
                    put(index, char.digitToInt())
                }
            }
            allNumbers.forEach { numberString ->
                val found = input.indexOf(numberString)
                if (found != -1) {
                    stringToNumber(numberString)?.let {
                        put(found, it)
                    }
                }
                val foundLast = input.lastIndexOf(numberString)
                if (foundLast != -1) {
                    stringToNumber(numberString)?.let {
                        put(foundLast, it)
                    }
                }
            }
        }

        return indexedNumbers.toSortedMap().values.joinToString("")
    }

    fun getCalibrationValue(input: String): Int? {
        val onlyNumbers = getAllNumbers(input)
        return if (onlyNumbers.isNotEmpty())
            "${onlyNumbers.first()}${onlyNumbers.last()}".toIntOrNull()
        else 0
    }

    fun stringToNumber(string: String): Int? = when (string) {
        "one" -> 1
        "two" -> 2
        "three" -> 3
        "four" -> 4
        "five" -> 5
        "six" -> 6
        "seven" -> 7
        "eight" -> 8
        "nine" -> 9
        else -> null
    }
}
