package ru.job4j.base.bank

data class AccountBank(var requisite: String, var balance: Double) {

    fun get() = balance

    fun upBalance(up: Double) = balance + up

    fun downBalance(down: Double) = balance - down
}