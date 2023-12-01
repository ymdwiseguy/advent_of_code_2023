package day14

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import shouldBe

class Day14Test {

    private lateinit var day: Day14
    private val input: List<String> = Day14().testInput

    @BeforeEach
    fun before() {
        day = Day14()
    }

    @Test
    fun `failing dummy test`() {
         input.size shouldBe 1
    }
}