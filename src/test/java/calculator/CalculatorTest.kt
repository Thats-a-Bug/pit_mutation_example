package calculator

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class CalculatorTest {

    @Test
    fun testAddition() {
        val calculator = Calculator()
        calculator.add(2.0)
        assertThat(calculator.getResult()).isEqualTo(2.0)
    }

    @Test
    fun testSubtraction() {
        val calculator = Calculator(5.0)
        calculator.subtract(2.0)
        assertThat(calculator.getResult()).isEqualTo(3.0)
    }

    @Test
    fun testPower() {
        val calculator = Calculator(displayedValue = 2.0)
        calculator.power(3.0)
        assertThat(calculator.getResult()).isEqualTo(8.0)
    }

    @Test
    fun testConditionalSetTrue() {
        val calculator = Calculator()
        assertThat(calculator.tryToSetDisplay(2.0, true)).isTrue()
    }

    @Test
    fun testConditionalSetFalse() {
        val calculator = Calculator()
        assertThat(calculator.tryToSetDisplay(2.0, false)).isFalse()
    }
}