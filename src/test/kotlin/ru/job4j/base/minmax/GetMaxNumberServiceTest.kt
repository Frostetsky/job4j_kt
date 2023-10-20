package ru.job4j.base.minmax

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class GetMaxNumberServiceTest {

    private val maxService = GetMaxNumberService()

    @Test
    fun maxForTwoNumber() {
        Assertions.assertEquals(maxService.max(2, 5), 5)
    }

    @Test
    fun maxForThreeNumber() {
        Assertions.assertEquals(maxService.max(2, 0, - 10), 2)
    }
}
