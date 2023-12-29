package ru.job4j.base.tracker

import kotlin.math.absoluteValue
import kotlin.random.Random

const val INCORRECT_INDEX = 1;

class Tracker {

    private val store = arrayListOf<Item>()

    /**
     * Метод реализующий добавление заявки в хранилище.
     * @param item новая заявка.
     */
    fun add(item : Item) : Item {
        item.id = generateId()
        store += item
        return item
    }

    /**
     * Метод возвращает заявку по id.
     * @param id - id заявки.
     * @return Нужная заявка.
     */
    fun findById(id : Int) : Item? {
        val index = indexOf(id)
        return if (index != INCORRECT_INDEX) store[index] else null
    }

    /**
     * Возвращает список заявок.
     * @return список заявок.
     */
    fun findAll() : MutableList<Item> {
        return ArrayList(store)
    }

    /**
     * Возвращает лист Итемов с одинаковыми именами.
     * @key Ключ для нахождения сходства в массиве items
     * @return Лист итемов с одинаковыми именами.
     */
    fun findByName(name : String) : MutableList<Item> {
        val rsl = arrayListOf<Item>();
        for (item in store) {
            if (name == item.name) {
                rsl += item
            }
        }
        return rsl;
    }

    /**
     * Метод заменяет заявку по id.
     * @param id - id который необходимо заменить.
     * @param item новая заявка.
     * @return успешность результата выполнения.
     */
    fun replace(id : Int, item: Item) : Boolean {
        val index = indexOf(id)
        if (index != INCORRECT_INDEX) {
            item.id = id
            store[index] = item
            return true
        }
        return false
    }

    /**
     * Метод удаляет заявку по её id.
     * @param id - id заявки.
     * @return успешность результата выполнения.
     */
    fun remove(id: Int) : Boolean {
        val index = indexOf(id)
        if (index != INCORRECT_INDEX) {
            store.removeAt(index);
            return true
        }
        return false
    }

    /**
     * Метод возвращает индекс ячейки массива по его id.
     * @param id - id заявки.
     * @return индекс ячейки под которым содержится нужный объект.
     */
    private fun indexOf(id : Int) : Int {
        var rsl = INCORRECT_INDEX
        for (index in store.indices) {
            if (store[index].id == id) {
                rsl = index
                break
            }
        }
        return rsl
    }

    private fun generateId() : Int = Random.nextInt().absoluteValue
}