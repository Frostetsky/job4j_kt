package ru.job4j.base.oop

class Student(name : String = "", surname : String = "", phone : String = "", email : String = "")

fun main(args: Array<String>) {
    val oneObj = Student(name = "Nikita")
    val twoObj = Student(name = "Nikita", surname = "Nesterenko")
    val thirdObj = Student(name = "Nikita", surname = "Nesterenko", phone = "8-800-555-35-35")
    val fourthObj = Student(name = "Nikita", surname = "Nesterenko", phone = "8-800-555-35-35", email = "abc@bk.ru")
}