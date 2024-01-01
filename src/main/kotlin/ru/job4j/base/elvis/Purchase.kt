package ru.job4j.base.elvis

import java.util.Date

data class Purchase(val name: String, val created: Date, val address: Address? = null)