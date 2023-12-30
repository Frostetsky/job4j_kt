package ru.job4j.base.tracker.action

import ru.job4j.base.tracker.input.Input
import ru.job4j.base.tracker.store.Store

class ExitAction : Action {

    override fun getActionName(): String = "==== Exit Program ===="

    override fun execute(input: Input, store: Store): Boolean = false
}