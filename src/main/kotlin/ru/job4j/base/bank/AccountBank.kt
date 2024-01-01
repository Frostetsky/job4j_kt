package ru.job4j.base.bank

data class AccountBank(val requisite: String, val balance: Double) {

    fun get() = balance

    fun upBalance(up: Double) = balance + up

    fun downBalance(down: Double) = balance - down
}