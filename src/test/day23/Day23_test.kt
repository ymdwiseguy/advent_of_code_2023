package day23

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import shouldBe

class Day23Test {

    private lateinit var day: Day23
    private val input: List<String> = Day23().testInput

    @BeforeEach
    fun before() {
        day = Day23()
    }

    @Test
    fun `failing dummy test`() {
         input.size shouldBe 1
    }
}