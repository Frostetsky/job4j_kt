package ru.job4j.base.elvis

class PurchaseService {

    fun formHtmlTable(purchases: MutableList<Purchase>) {
        println(with(StringBuilder()) {
            append("<table>\n")
            append("    <tr>\n")
            append("        <th>Name</th>\n")
            append("        <th>Created</th>\n")
            append("        <th>Address</th>\n")
            append("    </tr>\n")
            purchases.forEach{
                run {
                    append("    <tr>\n")
                    append("        <td>${it.name}</td>\n")
                    append("        <td>${it.created}</td>\n")
                    append("        <td>${it.address?.toString() ?: ""}</td>\n")
                    append("    </tr>\n")
                }
            }
            append("</table>")
        }.toString())
    }
}