package ru.job4j.base.lambda

fun main() {

    val decrement = { x: Int -> x - 1 }
    val square = { x: Int -> x * x }

    println(decrement(6))
    println(square(2))
}