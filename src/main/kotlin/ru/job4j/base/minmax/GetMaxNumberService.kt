package ru.job4j.base.minmax

class GetMaxNumberService {

    fun getMaxFromTwoNumber(a : Int, b : Int) = if (a > b) a else b

    fun getMaxFromThreeNumber(a : Int, b : Int, c : Int) : Int {
        return getMaxFromTwoNumber(getMaxFromTwoNumber(a, b), c)
    }
}