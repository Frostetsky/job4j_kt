package ru.job4j.base

import ru.job4j.base.calculator.Calculator

fun main(args: Array<String>) {
    val calc = Calculator()
    val a : Int = 2
    val b : Int = 5
    println(calc.divide(a, b))
    println(calc.fold(a, b))
    println(calc.subtract(a, b))
    println(calc.multiple(a, b));
}