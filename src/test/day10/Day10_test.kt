package day10

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import shouldBe

class Day10Test {

    private lateinit var day: Day10
    private val input: List<String> = Day10().testInput

    @BeforeEach
    fun before() {
        day = Day10()
    }

    @Test
    fun `failing dummy test`() {
         input.size shouldBe 1
    }
}