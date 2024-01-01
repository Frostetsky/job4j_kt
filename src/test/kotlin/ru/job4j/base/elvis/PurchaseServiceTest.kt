package ru.job4j.base.elvis

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.util.*

class PurchaseServiceTest {


    @Test
    fun printWithElvis() {
        val purchaseService = PurchaseService()
        val testList = mutableListOf(
            Purchase("Стиральная машинка", Date(), Address("А", "B", true)),
            Purchase("Телевизор", Date()),
            Purchase("Чайник", Date())
        )
        purchaseService.formHtmlTable(testList)
    }
}