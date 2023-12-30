package ru.job4j.base.lambda

class HtmlTable {

    fun table(): String {
        StringBuilder().apply {
            append("<table>")
            append("<tr>")
            append("<td>")
            append("<tr>Id</tr>")
            append("<tr>Name</tr>")
            append("</td>")
            append("</table>")
            return toString()
        }
    }
}