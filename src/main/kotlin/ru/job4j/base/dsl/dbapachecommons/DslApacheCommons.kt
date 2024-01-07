package ru.job4j.base.dsl.dbapachecommons

import org.apache.commons.dbcp2.BasicDataSource


fun main() {
    dataSource {
        driverClassName = "org.postgres.Driver"
        username = "postgres"
        password = "password"
        url = "localhost"
        minIdle = 5
        maxIdle = 10
        maxOpenPreparedStatements = 100
    }
}

fun dataSource(dataSource: BasicDataSource.() -> Unit): BasicDataSource = BasicDataSource().apply(dataSource)