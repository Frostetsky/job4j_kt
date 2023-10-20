package ru.job4j.base.cycles

import org.junit.jupiter.api.Test

class PaintTest {

    private val paint = Paint()

    @Test
    fun printX() {
        paint.draw(5)
    }
}