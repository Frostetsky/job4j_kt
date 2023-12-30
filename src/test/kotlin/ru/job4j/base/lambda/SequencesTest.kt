package ru.job4j.base.lambda

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SequencesTest {

    @Test
    fun countTest() {
        val list = arrayListOf(5, 12, 10, 50, 11)

        val sequences = Sequences()

        val rsl = sequences.count(list)

        // 13 + 11 + 51 =
        assertEquals(rsl, 75)
    }
}