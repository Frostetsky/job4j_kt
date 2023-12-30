package ru.job4j.base.lambda

class Sequences {

    fun count(list: List<Int>): Int {
        return list
            .stream()
            .filter{ it % 2 == 0 }
            .mapToInt{ it + 1 }
            .sum()
    }
}