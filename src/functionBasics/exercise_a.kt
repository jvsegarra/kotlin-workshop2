package functionBasics

import java.util.Date



fun main(args: Array<String>) {

    // TODO: [functionBasics] Call it with named parameters changing the order
    printMessage("Hello", true)

}


fun printMessage(message: String) {
    println(message)
}

// TODO: [functionBasics] Refactor this to use optional parameters and string interpolation
fun printMessage(message: String, printDateTime: Boolean) {
    if (printDateTime) {
        println("[" + Date().toString() + "] " + message)
    }

}


