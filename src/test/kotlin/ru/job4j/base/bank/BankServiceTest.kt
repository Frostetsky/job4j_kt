package ru.job4j.base.bank

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import ru.job4j.base.account.Account

class BankServiceTest {

    @Test
    fun addUserAddAccountAndGetAllAccounts() {
        val bankService = BankService()
        bankService.addUser(User("123", "Nikita"))
        bankService.addAccount("123", AccountBank("555", 150.0))
        bankService.addAccount("123", AccountBank("1025", 25.0))
        assertEquals(150.0, bankService.findByRequisite("123", "555")!!.balance)
        assertEquals(25.0, bankService.findByRequisite("123", "1025")!!.balance)
    }

    @Test
    fun addUserAddAccountAndGetWithNullElements() {
        val bankService = BankService()
        bankService.addUser(User("123", "Nikita"))
        assertNull(bankService.findByPassport("215"))
        assertNull(bankService.findByRequisite("524", "555"))
    }

    @Test
    fun findAccounts() {
        val bankService = BankService()
        bankService.addUser(User("123", "Nikita"))
        bankService.addAccount("123", AccountBank("555", 0.0))
        assertNull(bankService.findAccounts("215"))
        assertNotNull(bankService.findAccounts("123"))
    }
}
