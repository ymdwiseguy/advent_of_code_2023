package day22

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import shouldBe

class Day22Test {

    private lateinit var day: Day22
    private val input: List<String> = Day22().testInput

    @BeforeEach
    fun before() {
        day = Day22()
    }

    @Test
    fun `failing dummy test`() {
         input.size shouldBe 1
    }
}