package ru.job4j.base.minmax

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class GetMaxNumberServiceTest : StringSpec({
    val maxService = GetMaxNumberService()
    "getMax(2,5) return 5" {
        maxService.getMaxFromTwoNumber(2, 5) shouldBe 5
    }

    "getMax(0, -2, 10) return 10" {
        maxService.getMaxFromThreeNumber(0, -2, 10) shouldBe 10
    }
})