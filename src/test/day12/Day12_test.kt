package day12

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import shouldBe

class Day12Test {

    private lateinit var day: Day12
    private val input: List<String> = Day12().testInput

    @BeforeEach
    fun before() {
        day = Day12()
    }

    @Test
    fun `failing dummy test`() {
         input.size shouldBe 1
    }
}