package functions

import kotlin.platform.platformStatic


// TODO: [functions] Extend the StringBuilder class and override the behavior of the += operator to append a string
fun StringBuilder.plusAssign(string: String) {
    this.append(string)
}

object MainC {
    @platformStatic
    fun main(args: Array<String>) {
        var s: StringBuilder = StringBuilder("hola")
        println(s)

        s += " y adios"
        println(s)
    }
}