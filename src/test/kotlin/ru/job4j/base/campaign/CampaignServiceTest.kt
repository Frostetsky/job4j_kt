package ru.job4j.base.campaign

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.util.*

class CampaignServiceTest {

    @Test
    fun testToStringCampaign() {

        val campaign = Campaign(
            name = "AO РайфайзенБанк",
            address = Address("Москва Ул.Пушкина 26"),
            created = Date(1534035L))
        val campaignService = CampaignService()

        val rsl = campaignService.getStringCampaign(arrayListOf(campaign))

        assertEquals(rsl[0], "AO РайфайзенБанк | Москва Ул.Пушкина 26 | ${Date(1534035L)}")
    }
}