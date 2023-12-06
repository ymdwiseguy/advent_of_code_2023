package day03

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import shouldBe

class Day03Test {

    private lateinit var day: Day03
    private val input: List<String> = Day03().testInput

    @BeforeEach
    fun before() {
        day = Day03()
    }

    @Test
    fun `solve part 2`() {
         day.part2(input) shouldBe 467835L
         day.part2(day.input) shouldBe 91622824L
    }

    @Test
    fun `find gears`() {
        val symbols = day.findSymbols(input)
        val numbers = day.findNumbers(input)
         day.findGears(symbols, numbers) shouldBe listOf(
             Symbol(
                 coordinate = Coordinate(x = 4, y = 2),
                 char = '*',
                 adjacentNumbers = mutableSetOf(
                     MyNumber(1..3,1,"467"),
                     MyNumber(3..4,3,"35"),
                 )
             ),
             Symbol(
                 coordinate = Coordinate(x = 6, y = 9),
                 char = '*',
                 adjacentNumbers = mutableSetOf(
                     MyNumber(7..9,8,"755"),
                     MyNumber(6..8,10,"598"),
                 )
             ),
         )
    }

    @Test
    fun `solve part 1`() {
         day.part1(input) shouldBe 4361
         day.part1(day.input) shouldBe 560670
    }

    @Test
    fun `get neighbours`() {
        MyNumber(1..3,1,"467").neighbours() shouldBe listOf(
            Coordinate(0,0),
            Coordinate(0,1),
            Coordinate(0,2),
            Coordinate(1,0),
            Coordinate(1,2),
            Coordinate(2,0),
            Coordinate(2,2),
            Coordinate(3,0),
            Coordinate(3,2),
            Coordinate(4,0),
            Coordinate(4,1),
            Coordinate(4,2),
        )
    }

    @Test
    fun `find symbols with coordinates`() {
         day.findSymbols(input) shouldBe listOf(
             Symbol(Coordinate(4, 2), '*'),
             Symbol(Coordinate(7, 4), '#'),
             Symbol(Coordinate(4, 5), '*'),
             Symbol(Coordinate(6, 6), '+'),
             Symbol(Coordinate(4, 9), '$'),
             Symbol(Coordinate(6, 9), '*'),
         )
    }

    @Test
    fun `find numbers with coordinates`() {
         day.findNumbers(input) shouldBe listOf(
             MyNumber(1..3,1,"467"),
             MyNumber(6..8,1,"114"),
             MyNumber(3..4,3,"35"),
             MyNumber(7..9,3,"633"),
             MyNumber(1..3,5,"617"),
             MyNumber(8..9,6,"58"),
             MyNumber(3..5,7,"592"),
             MyNumber(7..9,8,"755"),
             MyNumber(2..4,10,"664"),
             MyNumber(6..8,10,"598"),
         )
    }
}