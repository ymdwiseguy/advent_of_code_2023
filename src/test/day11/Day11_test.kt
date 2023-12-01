package day11

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import shouldBe

class Day11Test {

    private lateinit var day: Day11
    private val input: List<String> = Day11().testInput

    @BeforeEach
    fun before() {
        day = Day11()
    }

    @Test
    fun `failing dummy test`() {
         input.size shouldBe 1
    }
}