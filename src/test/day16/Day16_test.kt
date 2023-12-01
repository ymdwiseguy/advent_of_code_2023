package day16

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import shouldBe

class Day16Test {

    private lateinit var day: Day16
    private val input: List<String> = Day16().testInput

    @BeforeEach
    fun before() {
        day = Day16()
    }

    @Test
    fun `failing dummy test`() {
         input.size shouldBe 1
    }
}