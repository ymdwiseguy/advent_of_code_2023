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
    fun `result part 2`() {
         day.part2(day.input) shouldBe 54985
    }

    @Test
    fun `sample for more than one same number`() {
         day.getAllNumbers("eighttkbtzjz6nineeight") shouldBe "8698"
    }

    @Test
    fun `map spelled out numbers to int`() {
        day.allNumbers.map {
            day.stringToNumber(it)
        } shouldBe listOf(1,2,3,4,5,6,7,8,9)
    }

    @Test
    fun `get all numbers`() {
        day.getAllNumbers(input[0]) shouldBe "219"
        day.getAllNumbers(input[1]) shouldBe "823"
        day.getAllNumbers(input[2]) shouldBe "123"
        day.getAllNumbers(input[3]) shouldBe "2134"
        day.getAllNumbers(input[4]) shouldBe "49872"
        day.getAllNumbers(input[5]) shouldBe "18234"
        day.getAllNumbers(input[6]) shouldBe "76"
    }
    @Test
    fun `get calibration value for line`() {
         day.getCalibrationValue(input[0]) shouldBe 29
         day.getCalibrationValue(input[1]) shouldBe 83
         day.getCalibrationValue(input[2]) shouldBe 13
         day.getCalibrationValue(input[3]) shouldBe 24
         day.getCalibrationValue(input[4]) shouldBe 42
         day.getCalibrationValue(input[5]) shouldBe 14
         day.getCalibrationValue(input[6]) shouldBe 76
    }

    @Test
    fun `sum of calculation values`() {
         day.part2(input) shouldBe 281
    }

}