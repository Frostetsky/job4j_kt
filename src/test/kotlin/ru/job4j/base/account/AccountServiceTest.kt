package ru.job4j.base.account

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class AccountServiceTest {

    @Test
    fun testGetAccountByPredicate() {

        val accountService = AccountService()

        val listAccounts = arrayListOf(
            Account(name = "Ivan Morganick", balance = 150),
            Account(name = "Dima Sigvaya", balance = -10),
            Account(name = "Nikita Vorchik", balance = 20),
            Account(name = "Ivan Rogvaya", balance = -15),
            Account(name = "Ivan Norgov", balance = 35)
        )

        val rsl = accountService.getAccountsByPredicate(
            listAccounts,
            { account: Account -> account.name.contains("Ivan") },
            { account: Account -> account.balance > 0 })

        assertEquals(rsl[0], Account(name = "Ivan Morganick", balance = 150))
        assertEquals(rsl[1], Account(name = "Ivan Norgov", balance = 35))
    }
}
