package day02

import day02.CubeColor.*
import multiplied
import readInput

fun main() {
    println("Part 1: ${Day02().part1(Day02().input)}")
    println("Part 2: ${Day02().part2(Day02().input)}")
}

class Day02 {
    val input = readInput("resources/day02/data")
    val testInput = readInput("resources/day02/data_test")

    fun part1(input: List<String>): Int = parseInput(input).sumOf { game ->
        if (
            game.maxOf(GREEN) <= GREEN.maxValue()
            && game.maxOf(RED) <= RED.maxValue()
            && game.maxOf(BLUE) <= BLUE.maxValue()
        ) {
            game.id
        } else 0
    }

    fun part2(input: List<String>): Int = parseInput(input).sumOf { game ->
        game.power()
    }

    fun parseInput(input: List<String>): List<Game> = input.map {
        val parts = it.split("Game ", ": ", "; ")
        val draws = mutableListOf<Draw>()
        parts.forEachIndexed { index, string ->
            if (index > 1) {
                val cubes = mutableListOf<Cubes>()
                val cubeStrings = string.split(", ")
                cubeStrings.forEach { cubeString ->
                    val cubeParts = cubeString.split(" ")
                    cubes.add(
                        Cubes(cubeParts.first().toInt(), CubeColor.valueOf(cubeParts.last().uppercase()))
                    )
                }

                draws.add(Draw(cubes))
            }
        }

        Game(
            id = parts[1].toIntOrNull() ?: 0,
            draws = draws
        )
    }
}

data class Game(
    val id: Int,
    val draws: List<Draw>
) {
    fun maxOf(cubeColor: CubeColor): Int {
        return draws.maxOf { draw ->
            draw.cubes.maxOf {
                if (it.color == cubeColor) it.count else 0
            }
        }
    }

    fun power(): Int = CubeColor.entries.multiplied { cubeColor ->
        maxOf(cubeColor)
    }

}

data class Draw(
    val cubes: List<Cubes>
)

data class Cubes(
    val count: Int,
    val color: CubeColor,
)

enum class CubeColor {
    RED, GREEN, BLUE;

    fun maxValue(): Int = when (this) {
        RED -> 12
        GREEN -> 13
        BLUE -> 14
    }
}