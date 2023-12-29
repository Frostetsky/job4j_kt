package ru.job4j.base.tracker

import java.sql.Timestamp

class Item {

    private var id = 0

    private var name = ""

    private var description = ""

    private var created = Timestamp(System.currentTimeMillis())

    fun getId() = id

    fun setId(id : Int) {
        this.id = id
    }

    fun getName() = name

    fun setName(name : String) {
        this.name = name
    }

    fun getDescription() = description

    fun setDescription(description : String) {
        this.description = description
    }

    fun getCreated() = created

    fun setCreated(created : Timestamp) {
        this.created = created
    }

    override fun toString(): String = "$id | $name | $description | $created"
}