package functions

import kotlin.platform.platformStatic

// TODO: [functions] Create a function called sum that takes two parameters and adds them. Call it in infix notation
fun Int.sum(param: Int): Int {
    return this + param
}

object Main {
    @platformStatic
    fun main(args: Array<String>) {
        var x = 1
        println(x sum 2)
    }
}