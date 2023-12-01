package day19

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import shouldBe

class Day19Test {

    private lateinit var day: Day19
    private val input: List<String> = Day19().testInput

    @BeforeEach
    fun before() {
        day = Day19()
    }

    @Test
    fun `failing dummy test`() {
         input.size shouldBe 1
    }
}