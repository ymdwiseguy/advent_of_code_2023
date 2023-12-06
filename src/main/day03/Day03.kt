package day03

import readInput

fun main() {
    println("Part 1: ${Day03().part1(Day03().input)}")
    println("Part 2: ${Day03().part2(Day03().input)}")
}

class Day03 {
    val input = readInput("resources/day03/data")
    val testInput = readInput("resources/day03/data_test")

    fun part1(input: List<String>): Int {
        val symbols = findSymbols(input)
        val numbers = findNumbers(input)

        var sum = 0
        numbers.forEach { myNumber ->
            if (symbols.map(Symbol::coordinate).any { it in myNumber.neighbours() }) {
                sum += myNumber.number.toInt()
            }
        }
        return sum
    }

    fun part2(input: List<String>): Long = findGears(findSymbols(input), findNumbers(input)).sumOf {
        it.adjacentNumbers.first().number.toLong() * it.adjacentNumbers.last().number.toLong()
    }

    fun findNumbers(input: List<String>): List<MyNumber> = input.flatMapIndexed { indexY: Int, row: String ->
        var indexX = 1
        val numbers = mutableListOf<MyNumber>()
        row.mapNotNull { char ->
            if (char.isDigit()) {
                when {
                    numbers.isEmpty() -> numbers.add(
                        MyNumber(indexX..indexX, indexY + 1, char.toString())
                    )

                    numbers.last().x.last == indexX - 1 -> {
                        val lastNumber = numbers.last()
                        numbers.remove(lastNumber)
                        numbers.add(
                            lastNumber.copy(
                                lastNumber.x.first..indexX, indexY + 1, lastNumber.number + char
                            )
                        )
                    }

                    else -> numbers.add(
                        MyNumber(indexX..indexX, indexY + 1, char.toString())
                    )
                }
            }
            indexX++
        }
        numbers
    }

    fun findSymbols(input: List<String>): List<Symbol> = input.flatMapIndexed { indexY, row ->
        var indexX = 1
        row.mapNotNull { char ->
            val returnValue = if (char.isDigit().not() && char != '.') Symbol(
                Coordinate(indexX, indexY + 1), char
            ) else null
            indexX++
            returnValue
        }
    }

    fun findGears(symbols: List<Symbol>, numbers: List<MyNumber>): List<Symbol> {
        val potentialGears = symbols.filter { it.char == '*' }
        val relevantNeighbours = mutableListOf<MyNumber>()
        numbers.forEach { myNumber ->
            if (potentialGears.map(Symbol::coordinate).any { it in myNumber.neighbours() }) {
                relevantNeighbours.add(myNumber)
            }
        }

        potentialGears.forEach { symbol ->
            relevantNeighbours.forEach { myNumber ->
                if (symbol.coordinate in myNumber.neighbours()) {
                    symbol.adjacentNumbers.add(myNumber)
                }
            }
        }

        return potentialGears.filter { it.adjacentNumbers.size == 2 }
    }
}

data class Coordinate(
    val x: Int,
    val y: Int,
)

data class MyNumber(
    val x: IntRange,
    val y: Int,
    val number: String,
) {
    fun neighbours(): List<Coordinate> = listOf(
        Coordinate(x.first - 1, y - 1),
        Coordinate(x.first - 1, y),
        Coordinate(x.first - 1, y + 1),
    ) + x.flatMap { xValue: Int ->
        listOf(
            Coordinate(xValue, y - 1),
            Coordinate(xValue, y + 1),
        )
    } + listOf(
        Coordinate(x.last + 1, y - 1),
        Coordinate(x.last + 1, y),
        Coordinate(x.last + 1, y + 1),
    )
}

data class Symbol(
    val coordinate: Coordinate,
    val char: Char,
    val adjacentNumbers: MutableSet<MyNumber> = mutableSetOf()
)
