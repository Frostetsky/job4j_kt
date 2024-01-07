package ru.job4j.base.lateinit

import java.sql.Connection
import java.sql.DriverManager

class SqlExecute {

    private lateinit var connection: Connection

    private fun initConnection() {
        connection = DriverManager.getConnection(
            "http://localhost:5432/postgres",
            "mock",
            "mock")
    }


    fun exec(sql: String): String {
        if (!connection.isClosed) {
            println(sql)
        }
        return sql
    }
}

fun main() {
    SqlExecute().exec("SELECT * FROM USERS")
}