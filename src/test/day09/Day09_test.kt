package day09

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import shouldBe

class Day09Test {

    private lateinit var day: Day09
    private val input: List<String> = Day09().testInput

    @BeforeEach
    fun before() {
        day = Day09()
    }

    @Test
    fun `failing dummy test`() {
         input.size shouldBe 1
    }
}