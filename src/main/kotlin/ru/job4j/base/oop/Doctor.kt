package ru.job4j.base.oop

class Doctor : Profession() {

    override fun action() {
       println("Healthiness people")
    }

    override fun getName() {
        println("Doctor...")
    }
}