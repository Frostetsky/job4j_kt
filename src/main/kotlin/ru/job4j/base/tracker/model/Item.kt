package ru.job4j.base.tracker.model

import java.sql.Timestamp

data class Item(
    var id: Int = 0,
    var name: String = "",
    var description: String = "",
    var created: Timestamp = Timestamp(System.currentTimeMillis()))