package day05

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import shouldBe

class Day05Test {

    private lateinit var day: Day05
    private val input: List<String> = Day05().testInput

    @BeforeEach
    fun before() {
        day = Day05()
    }

    @Test
    fun `failing dummy test`() {
         input.size shouldBe 1
    }
}