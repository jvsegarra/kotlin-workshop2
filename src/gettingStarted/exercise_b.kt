package gettingStarted

import java.util.Date



fun main(args: Array<String>) {

    // TODO: [gettingStarted] Call it with named parameters changing the order
    printMessage(printDateTime = true, message = "Hello" )
    printMessage()
}


fun printMessage(message: String) {
    println(message)
}

// TODO: [gettingStarted] Refactor this to use optional parameters and string interpolation
fun printMessage(message: String = "Hello", printDateTime: Boolean = true) {
    if (printDateTime) {
        println("[ ${Date().toString()} ] $message")
    }

}


