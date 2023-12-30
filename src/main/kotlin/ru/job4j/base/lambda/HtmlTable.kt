package ru.job4j.base.lambda

class HtmlTable {

    fun table(row: Int, cell: Int): String {
        StringBuilder().apply {
            append("<table>")
            for (rows in 0 .. row) {
                append("<tr>")
                for (cells in 0 .. cell) {
                    append("<td></td>")
                }
                append("</tr>")
            }
            append("</table>")
            return toString()
        }
    }
}