import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

fun sumTwoNumbers(a: Int, b: Int): Int {
    return a + b
}

class SumTwoNumbersTest {
    @Test
    fun `test sum adds two numbers`() {
        val result = sumTwoNumbers(10, 5)
        assertEquals(15, result)
    }
}
