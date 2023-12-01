package day20

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import shouldBe

class Day20Test {

    private lateinit var day: Day20
    private val input: List<String> = Day20().testInput

    @BeforeEach
    fun before() {
        day = Day20()
    }

    @Test
    fun `failing dummy test`() {
         input.size shouldBe 1
    }
}