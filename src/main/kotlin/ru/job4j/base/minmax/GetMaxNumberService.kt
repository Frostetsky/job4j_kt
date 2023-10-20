package ru.job4j.base.minmax

class GetMaxNumberService {

    fun max(a : Int, b : Int) = if (a > b) a else b

    fun max(a : Int, b : Int, c : Int) : Int {
        return max(max(a, b), c)
    }
}