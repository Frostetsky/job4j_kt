package ru.job4j.base.oop

class Builder : Profession() {

    override fun action() {
        println("Build house")
    }

    override fun getName() {
        println("Builder...")
    }
}