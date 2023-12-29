package ru.job4j.base.tracker

import java.sql.Timestamp

data class Item(
    var id : Int,
    var name : String,
    var description : String,
    var created : Timestamp)