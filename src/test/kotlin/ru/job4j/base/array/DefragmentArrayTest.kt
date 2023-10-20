package ru.job4j.base.array

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class DefragmentArrayTest {

    val defragmentArray = DefragmentArray()

    /**
     * input -> [1, null, 3, null, null, 5, 10, null]
     * output -> [1, 3, 5, 10, null, null, null, null]
     */
    @Test
    fun getDefragmentionArray() {
        val names = arrayOfNulls<String>(8)
        names[0] = "1"
        names[2] = "3"
        names[5] = "5"
        names[6] = "10"
        val result = defragmentArray.defragment(names)
        val expected = arrayOfNulls<String>(8)
        expected[0] = "1"
        expected[1] = "3"
        expected[2] = "5"
        expected[3] = "10"

        assertArrayEquals(expected, result)
    }

    @Test
    fun getDefragmentionArrayWithOnlyNull() {
        val names = arrayOfNulls<String>(3)
        val result = defragmentArray.defragment(names)
        val expected = arrayOfNulls<String>(3)
        assertArrayEquals(expected, result)
    }

    @Test
    fun getDefragmentionArrayWithOnlyNotNull() {
        val names = arrayOfNulls<String>(2)
        names[0] = "1"
        names[1] = "3"
        val result = defragmentArray.defragment(names)
        val expected = arrayOfNulls<String>(2)
        expected[0] = "1"
        expected[1] = "3"
        assertArrayEquals(expected, result)
    }
}