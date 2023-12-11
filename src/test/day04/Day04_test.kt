package day04

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import shouldBe
import java.math.BigInteger

class Day04Test {

    private lateinit var day: Day04
    private val input: List<String> = Day04().testInput

    @BeforeEach
    fun before() {
        day = Day04()
    }

    @Test
    fun `solve part 2`() {
        day.part2(input) shouldBe BigInteger.valueOf(30)
        day.part2(day.input) shouldBe BigInteger.valueOf(15455663)
    }

    @Test
    fun `solve part 1`() {
        day.part1(input) shouldBe 13
        day.part1(day.input) shouldBe 23678
    }

    @Test
    fun `parse input`() {
        day.parseInput("Card 1: 41 48 83 86 17 | 83 86  6 31 17  9 48 53") shouldBe CARD_1
    }

    @Test
    fun `calculate card value`() {
        CARD_1.value() shouldBe 8
    }

    private companion object {
        val CARD_1 = Card(
            id = 1,
            winners = listOf(41, 48, 83, 86, 17),
            numbers = listOf(83, 86, 6, 31, 17, 9, 48, 53),
        )
    }
}