package functions

import kotlin.platform.platformStatic

// TODO: [functions] Extend the StringBuilder class by adding an emtpy() function that clears all entries
fun StringBuilder.empty() {
    this.setLength(0)
}

object MainB {
    @platformStatic
    fun main(args: Array<String>) {
        var s: StringBuilder = StringBuilder("hola")
        println(s)

        s.empty()
        println(s)
    }
}