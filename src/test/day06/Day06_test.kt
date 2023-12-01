package day06

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import shouldBe

class Day06Test {

    private lateinit var day: Day06
    private val input: List<String> = Day06().testInput

    @BeforeEach
    fun before() {
        day = Day06()
    }

    @Test
    fun `failing dummy test`() {
         input.size shouldBe 1
    }
}