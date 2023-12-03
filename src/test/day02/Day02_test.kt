package day02

import day02.CubeColor.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import shouldBe

class Day02Test {

    private lateinit var day: Day02
    private val input: List<String> = Day02().testInput

    @BeforeEach
    fun before() {
        day = Day02()
    }

    @Test
    fun `part 2`() {
         day.part2(day.testInput) shouldBe 2286
         day.part2(day.input) shouldBe 71535
    }

    @Test
    fun `part two powers`() {
        day.parseInput(input).map {
            it.power()
        } shouldBe listOf(48, 12, 1560, 630, 36)
    }

    @Test
    fun `part1 solved`() {
         day.part1(day.input) shouldBe 2720
    }

    @Test
    fun `is in max values`() {
        day.part1(input) shouldBe 8
    }

    @Test
    fun `get maxima`() {
        GAME_ONE.maxOf(BLUE) shouldBe 6
        GAME_ONE.maxOf(GREEN) shouldBe 2
        GAME_ONE.maxOf(RED) shouldBe 4
    }

    @Test
    fun `parse input`() {
        day.parseInput(listOf(input.first())) shouldBe listOf(
            GAME_ONE
        )
    }

    private companion object{
        val GAME_ONE = Game(
            id = 1,
            draws = listOf(
                Draw(
                    listOf(
                        Cubes(3, BLUE),
                        Cubes(4, RED),
                    )
                ),
                Draw(
                    listOf(
                        Cubes(1, RED),
                        Cubes(2, GREEN),
                        Cubes(6, BLUE),
                    )
                ),
                Draw(
                    listOf(
                        Cubes(2, GREEN),
                    )
                ),
            )
        )
    }
}