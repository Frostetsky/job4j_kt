package ru.job4j.base.oop

open class Profession {

    open fun action() {
        println("execute some action")
    }

    open fun getName() {
        println("custom name...")
    }
}

fun main() {
    val doctor = Doctor()
    val builder = Builder()
    doctor.action()
    doctor.getName()
}