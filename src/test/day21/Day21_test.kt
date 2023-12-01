package day21

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import shouldBe

class Day21Test {

    private lateinit var day: Day21
    private val input: List<String> = Day21().testInput

    @BeforeEach
    fun before() {
        day = Day21()
    }

    @Test
    fun `failing dummy test`() {
         input.size shouldBe 1
    }
}