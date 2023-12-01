package day07

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import shouldBe

class Day07Test {

    private lateinit var day: Day07
    private val input: List<String> = Day07().testInput

    @BeforeEach
    fun before() {
        day = Day07()
    }

    @Test
    fun `failing dummy test`() {
         input.size shouldBe 1
    }
}