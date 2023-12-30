package ru.job4j.base.campaign

import java.util.Date

class Campaign(var name: String, var address: Address, var created: Date) {

    override fun toString(): String = "$name | ${address.name} | $created"
}