package ru.job4j.base.tracker.action

import ru.job4j.base.tracker.input.Input
import ru.job4j.base.tracker.model.Item
import ru.job4j.base.tracker.store.Store

class AddAction : Action {

    override fun getActionName(): String = "==== Add Item ===="

    override fun execute(input: Input, store: Store): Boolean {
        val name = input.askStr("Enter name item")
        val description = input.askStr("Enter description item")
        val item = Item(name = name, description = description)
        store.add(item)
        return true
    }
}