package ru.job4j.base.tracker

import ru.job4j.base.tracker.action.Action
import ru.job4j.base.tracker.action.AddAction
import ru.job4j.base.tracker.action.ExitAction
import ru.job4j.base.tracker.action.FindAllAction
import ru.job4j.base.tracker.input.ConsoleInput
import ru.job4j.base.tracker.input.Input
import ru.job4j.base.tracker.store.MemStore
import ru.job4j.base.tracker.store.Store

class StartUI private constructor() {

    companion object {

        fun init(input: Input, store: Store, actions: Array<Action>) {
            var run = true;
            while (run) {
                showMenu(actions);
                val select = input.askInt("Select: ");
                if ((select < 0).or(select >= actions.size)) {
                    println("Wrong input, you can select: 0 ..  ${(actions.size - 1)}");
                    continue;
                }
                val action = actions[select];
                run = action.execute(input, store);
            }
        }

        private fun showMenu(actions: Array<Action>) {
            println("Menu.");
            for (index in actions.indices) {
                println("$index .  ${actions[index].getActionName()}");
            }
        }
    }
}

fun main(args: Array<String>) {
    val input = ConsoleInput()
    val store = MemStore()
    val actions = arrayOf(AddAction(), FindAllAction(), ExitAction())
    StartUI.init(input, store, actions)
}