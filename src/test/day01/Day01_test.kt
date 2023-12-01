package day01

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import shouldBe

class Day01Test {

    private lateinit var day: Day01
    private val input: List<String> = Day01().testInput

    @BeforeEach
    fun before() {
        day = Day01()
    }

    @Test
    fun `failing dummy test`() {
         input.size shouldBe 1
    }
}