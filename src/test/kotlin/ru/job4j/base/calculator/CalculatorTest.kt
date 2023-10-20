package ru.job4j.base.calculator

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CalculatorTest {

    private val calculator = Calculator()

    @Test
    fun testMultiple() {
        Assertions.assertEquals(20, calculator.multiple(4, 5));
    }

    @Test
    fun testDivide() {
        Assertions.assertEquals(calculator.divide(2, 4), 0.5)
    }

    @Test
    fun testFold() {
        Assertions.assertEquals(calculator.fold(2, 3), 5)
    }

    @Test
    fun testSubtract() {
        Assertions.assertEquals(calculator.subtract(5, 7), -2)
    }

    @Test
    fun testDivideOnZeroRight() {
        Assertions.assertEquals(calculator.divide(2, 0), Double.POSITIVE_INFINITY)
    }

    @Test
    fun testDivideOnZeroLeft() {
        Assertions.assertEquals(calculator.divide(-3, 0), Double.NEGATIVE_INFINITY)
    }
}