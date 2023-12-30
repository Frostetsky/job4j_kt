package ru.job4j.base.tracker.input

class ConsoleInput : Input {

    override fun askStr(question: String): String {
        println(question)
        return readLine().toString()
    }

    override fun askInt(question: String): Int = askStr(question).toInt()
}