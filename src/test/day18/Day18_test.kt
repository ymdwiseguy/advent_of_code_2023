package day18

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import shouldBe

class Day18Test {

    private lateinit var day: Day18
    private val input: List<String> = Day18().testInput

    @BeforeEach
    fun before() {
        day = Day18()
    }

    @Test
    fun `failing dummy test`() {
         input.size shouldBe 1
    }
}