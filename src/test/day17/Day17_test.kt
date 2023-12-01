package day17

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import shouldBe

class Day17Test {

    private lateinit var day: Day17
    private val input: List<String> = Day17().testInput

    @BeforeEach
    fun before() {
        day = Day17()
    }

    @Test
    fun `failing dummy test`() {
         input.size shouldBe 1
    }
}