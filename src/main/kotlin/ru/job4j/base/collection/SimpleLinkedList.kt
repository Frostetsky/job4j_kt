package ru.job4j.base.collection

import java.util.LinkedList

class SimpleLinkedList<T> : Iterable<T> {
    private var head : Node<T>? = null

    fun add(value: T) {
        if (head != null) {
            head = Node<T>(value)
        }
    }

    override fun iterator(): Iterator<T> {
        return LinkedIt()
    }

    private inner class LinkedIt : Iterator<T> {
        override fun hasNext(): Boolean {
            return head != null
        }

        override fun next(): T {
            if (!hasNext()) {
                throw NoSuchElementException()
            }
            return head!!.value
        }

    }

    private inner class Node<K>(val value: K, var next: Node<K>? = null)
}

fun main() {
    val linkedList = SimpleLinkedList<String>()
    linkedList.add("Nikita")
    linkedList.add("Fedya")
    val it = linkedList.iterator()
    println(it.next())
    println(it.next())
}