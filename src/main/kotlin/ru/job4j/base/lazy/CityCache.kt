package ru.job4j.base.lazy

class CityCache {

    private val citiesCache by lazy { loadCities() }

    private fun loadCities(): List<String> = listOf("Moscow", "St. Petersburg")

    fun getCities() = citiesCache
}

fun main() {
    println(CityCache().getCities())
}