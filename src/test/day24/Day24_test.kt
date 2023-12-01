package day24

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import shouldBe

class Day24Test {

    private lateinit var day: Day24
    private val input: List<String> = Day24().testInput

    @BeforeEach
    fun before() {
        day = Day24()
    }

    @Test
    fun `failing dummy test`() {
         input.size shouldBe 1
    }
}