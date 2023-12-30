package ru.job4j.base.tracker

class StartUI private constructor() {

    companion object {
        fun init(numberMenu: Int?, tracker : Tracker) : Boolean {
            when (numberMenu) {
                1 -> tracker.add(Item(name = "TestName"))
                2 -> println(tracker.findAll())
                else -> return false
            }
            return true
        }
    }
}

fun main(args: Array<String>) {
    val tracker = Tracker()
    var isNotExit = true;
    while (isNotExit) {
        val numberMenu = readLine()?.toInt()
        isNotExit = StartUI.init(numberMenu = numberMenu, tracker = tracker)
    }
}