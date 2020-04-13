package calculator

import org.junit.Assert
import org.junit.Test

class CalculatorTest {


    @Test
    fun testAddition() {
        val calculator = Calculator()
        calculator.add(2.0)
        Assert.assertEquals(calculator.getResult().toLong(), 2)
    }

    @Test
    fun testPower() {
        val calculator = Calculator(displayedValue = 2.0)
        calculator.power(3.0)
        Assert.assertEquals(calculator.getResult().toLong(), 8)
    }

    @Test
    fun testConditionalSetTrue() {
        val calculator = Calculator()
        Assert.assertTrue(calculator.tryToSetDisplay(2.0, true))
    }

    @Test
    fun testConditionalSetFalse() {
        val calculator = Calculator()
        Assert.assertFalse(calculator.tryToSetDisplay(3.0, false))
    }
}