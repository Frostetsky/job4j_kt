package ru.job4j.base.campaign

class CampaignService {

    fun getStringCampaign(campaigns: List<Campaign>): List<String> = campaigns.map{it.toString()}

}