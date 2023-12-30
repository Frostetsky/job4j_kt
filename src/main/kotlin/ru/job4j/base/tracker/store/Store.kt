package ru.job4j.base.tracker.store

import ru.job4j.base.tracker.model.Item

interface Store {

    /**
     * Метод реализующий добавление заявки в хранилище.
     * @param item новая заявка.
     */
    fun add(item : Item) : Item

    /**
     * Метод возвращает заявку по id.
     * @param id - id заявки.
     * @return Нужная заявка.
     */
    fun findById(id : Int) : Item?

    /**
     * Возвращает список заявок.
     * @return список заявок.
     */
    fun findAll() : MutableList<Item>

    /**
     * Возвращает лист Итемов с одинаковыми именами.
     * @key Ключ для нахождения сходства в массиве items
     * @return Лист итемов с одинаковыми именами.
     */
    fun findByName(name : String) : MutableList<Item>

    /**
     * Метод заменяет заявку по id.
     * @param id - id который необходимо заменить.
     * @param item новая заявка.
     * @return успешность результата выполнения.
     */
    fun replace(id : Int, item: Item) : Boolean

    /**
     * Метод удаляет заявку по её id.
     * @param id - id заявки.
     * @return успешность результата выполнения.
     */
    fun remove(id: Int) : Boolean
}