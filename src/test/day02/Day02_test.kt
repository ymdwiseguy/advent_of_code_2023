package day02

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import shouldBe

class Day02Test {

    private lateinit var day: Day02
    private val input: List<String> = Day02().testInput

    @BeforeEach
    fun before() {
        day = Day02()
    }

    @Test
    fun `failing dummy test`() {
         input.size shouldBe 1
    }
}