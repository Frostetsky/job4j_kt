package ru.job4j.base.tracker.action

import ru.job4j.base.tracker.input.Input
import ru.job4j.base.tracker.store.Store

interface Action {

    fun getActionName(): String

    fun execute(input: Input, store: Store): Boolean
}