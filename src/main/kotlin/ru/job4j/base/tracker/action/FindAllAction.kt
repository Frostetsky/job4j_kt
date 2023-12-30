package ru.job4j.base.tracker.action

import ru.job4j.base.tracker.input.Input
import ru.job4j.base.tracker.store.Store

class FindAllAction : Action {

    override fun getActionName(): String = "==== Find All Item ===="

    override fun execute(input: Input, store: Store): Boolean {
        for (item in store.findAll()) {
            println(item)
        }
        return true
    }
}