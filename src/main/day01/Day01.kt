package day01

import readInput

fun main() {
    println("Part 1: ${Day01().part1(Day01().input)}")
    println("Part 2: ${Day01().part2(Day01().input)}")
}

class Day01 {
    val input = readInput("resources/day01/data")
    val testInput = readInput("resources/day01/data_test")
    val allNumbers = listOf("one", "two", "three", "four", "five", "six", "seven", "eight", "nine")

    fun part1(input: List<String>): Int = input.sumOf { row ->
        getAllNumbersBasic(row).let { onlyNumbers ->
            "${onlyNumbers.first()}${onlyNumbers.last()}".toIntOrNull()
        } ?: 0
    }

    fun part2(input: List<String>): Int = input.sumOf { getCalibrationValue(it) ?: 0 }

    fun getAllNumbersBasic(input: String): String {
        val indexedNumbers = buildMap {
            input.forEachIndexed { index, char ->
                if (char.isDigit()) {
                    put(index, char.digitToInt())
                }
            }
        }

        return indexedNumbers.toSortedMap().values.joinToString("")
    }

    fun getAllNumbersAdvanced(input: String): String {
        val indexedNumbers = buildMap {
            input.forEachIndexed { index, char ->
                if (char.isDigit()) {
                    put(index, char.digitToInt())
                }
            }
            allNumbers.forEach { numberString ->
                var foundAll = input.indexOf(numberString)
                while (foundAll >= 0) {
                    stringToNumber(numberString)?.let {
                        put(foundAll, it)
                    }
                    foundAll = input.indexOf(numberString, foundAll + 1)
                }
            }
        }

        return indexedNumbers.toSortedMap().values.joinToString("")
    }

    fun getCalibrationValue(input: String): Int? = getAllNumbersAdvanced(input).let { onlyNumbers ->
        if(onlyNumbers.isNotEmpty())
            "${onlyNumbers.first()}${onlyNumbers.last()}".toIntOrNull()
        else null
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
