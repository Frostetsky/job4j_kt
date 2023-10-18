package ru.job4j.base.calculator

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class CalculatorTest : StringSpec({
    val calc = Calculator()
    "1 + 1 = 2" {
        calc.fold(1, 1) shouldBe 2
    }

    "1 - 1 = 0" {
        calc.subtract(1, 1) shouldBe 0
    }

    "2 * 10 = 20" {
        calc.multiple(2, 10) shouldBe 20
    }

    "2 / 10 = 0.2" {
        calc.divide(2, 10) shouldBe 0.2
    }

    "2 / 0 = infinity" {
        calc.divide(2, 0) shouldBe Double.POSITIVE_INFINITY
    }

    "-5 / 0 = -infinity" {
        calc.divide(-3, 0) shouldBe Double.NEGATIVE_INFINITY
    }
})