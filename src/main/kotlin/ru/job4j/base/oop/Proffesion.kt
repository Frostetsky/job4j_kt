package ru.job4j.base.oop

open class Proffesion(var fio : String = "emptyFio")

fun main() {
    val doctor = Doctor("N.A Borsovich")
    val builder = Builder("V.B Chursin")
    val incorrectDoctor = Doctor()
}