package day13

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import shouldBe

class Day13Test {

    private lateinit var day: Day13
    private val input: List<String> = Day13().testInput

    @BeforeEach
    fun before() {
        day = Day13()
    }

    @Test
    fun `failing dummy test`() {
         input.size shouldBe 1
    }
}