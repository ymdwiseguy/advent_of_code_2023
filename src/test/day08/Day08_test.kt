package day08

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import shouldBe

class Day08Test {

    private lateinit var day: Day08
    private val input: List<String> = Day08().testInput

    @BeforeEach
    fun before() {
        day = Day08()
    }

    @Test
    fun `failing dummy test`() {
         input.size shouldBe 1
    }
}