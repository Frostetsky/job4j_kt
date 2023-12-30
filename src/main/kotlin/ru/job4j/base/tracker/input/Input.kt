package ru.job4j.base.tracker.input

interface Input {

    fun askStr(question: String): String;

    fun askInt(question: String): Int;
}