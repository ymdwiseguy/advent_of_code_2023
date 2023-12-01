import java.io.File

fun main() {
    File("src/resources").mkdir()
    File("src/resources/input").mkdir()
    (1..25).map {
        val formattedDayNumber = it.toString().padStart(2, '0')
        createEmptyInputs(formattedDayNumber)
        createFiles(formattedDayNumber)
        createTestFiles(formattedDayNumber)
    }
}

private fun createEmptyInputs(it: String) {
    File("src/resources/day${it}").mkdir()
    File("src/resources/day${it}/data.txt").createNewFile()
    File("src/resources/day${it}/data_test.txt").createNewFile()
}

private fun createFiles(it: String) {
    File("src/main/day${it}").mkdir()
    val file = File("src/main/day${it}/Day$it.kt")
    file.createNewFile()
    val inputText = """
            package day${it}

            import readInput
            
            fun main() {
                println("Part 1: ${'$'}${'{'}Day${it}().part1(Day${it}().input)}")
                println("Part 2: ${'$'}${'{'}Day${it}().part2(Day${it}().input)}")
            }
            
            class Day${it} {
                val input = readInput("resources/day${it}/data")
                val testInput = readInput("resources/day${it}/data_test")
            
                fun part1(input: List<String>): Int = input.size
            
                fun part2(input: List<String>): Int = input.size
            }

        """.trimIndent()

    file.writeText(inputText)
}

private fun createTestFiles(it: String) {
    File("src/test/day${it}").mkdir()
    val testFile = File("src/test/day${it}/Day${it}_test.kt")
    val inputText = """
        package day${it}

        import org.junit.jupiter.api.BeforeEach
        import org.junit.jupiter.api.Test
        import shouldBe
        
        class Day${it}Test {
        
            private lateinit var day: Day${it}
            private val input: List<String> = Day${it}().testInput
        
            @BeforeEach
            fun before() {
                day = Day${it}()
            }
        
            @Test
            fun `failing dummy test`() {
                 input.size shouldBe 1
            }
        }
        """.trimIndent()

    testFile.createNewFile()
    testFile.writeText(inputText)

}