package ru.job4j.base.tracker

object StartUI {

    private val tracker = Tracker()

    fun init(numberMenu: Int?) : Boolean {
        when (numberMenu) {
            1 -> tracker.add(Item(name = "TestName"))
            2 -> println(tracker.findAll())
            else -> return false
        }
        return true
    }
}

fun main(args: Array<String>) {
    var isNotExit = true;
    while (isNotExit) {
        val numberMenu = readLine()?.toInt()
        val startUi = StartUI
        isNotExit = startUi.init(numberMenu)
    }
}