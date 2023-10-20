package ru.job4j.base.cycles

class Paint {

    /**
     * Нарисовать "X"
     * @param size размерность рисунка
     */
    fun draw(size: Int) {

        if (size % 2 == 0 || size <= 0) {
            return
        }

        for (row in 0 .. size) {
            for (col in 0 until size) {
                if (col == row || col == size - row - 1) print("X") else print(" ")
            }
            println()
        }
    }
}