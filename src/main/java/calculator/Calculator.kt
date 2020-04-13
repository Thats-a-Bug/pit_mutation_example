package calculator

import kotlin.math.pow

class Calculator(var displayedValue: Double = 0.0) {

    fun add(x: Double) {
        displayedValue += x
    }

    fun subtract(x: Double) {
        displayedValue -= x
    }

    fun power(x: Double) {
        displayedValue = displayedValue.pow(x)
    }

    fun getResult() = displayedValue

    fun tryToSetDisplay(x: Double, canChangeDisplay: Boolean): Boolean {
        return if (canChangeDisplay) {
            setDisplay(x)
            true
        } else {
            false
        }
    }

    private fun setDisplay(x: Double) {
        displayedValue = x
    }
}

