package gettingStarted

import java.util.Date



fun main(args: Array<String>) {

    // TODO: [gettingStarted] Call it with named parameters changing the order
    printMessage("Hello", true)

}


fun printMessage(message: String) {
    println(message)
}

// TODO: [gettingStarted] Refactor this to use optional parameters and string interpolation
fun printMessage(message: String, printDateTime: Boolean) {
    if (printDateTime) {
        println("[" + Date().toString() + "] " + message)
    }

}


