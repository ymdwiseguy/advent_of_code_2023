package day15

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import shouldBe

class Day15Test {

    private lateinit var day: Day15
    private val input: List<String> = Day15().testInput

    @BeforeEach
    fun before() {
        day = Day15()
    }

    @Test
    fun `failing dummy test`() {
         input.size shouldBe 1
    }
}