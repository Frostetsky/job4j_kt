package ru.job4j.base.array

class DefragmentArray {

    fun defragment(array: Array<String?>) : Array<String?> {
        val result = arrayOfNulls<String>(array.size)
        var startingIndex = 0
        for (value in array) {
            if (value != null) {
                result[startingIndex] = value
                startingIndex++
            }
        }
        return result
    }
}