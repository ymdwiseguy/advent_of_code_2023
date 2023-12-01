package day25

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import shouldBe

class Day25Test {

    private lateinit var day: Day25
    private val input: List<String> = Day25().testInput

    @BeforeEach
    fun before() {
        day = Day25()
    }

    @Test
    fun `failing dummy test`() {
         input.size shouldBe 1
    }
}