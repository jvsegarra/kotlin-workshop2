package gettingStarted

import kotlin.platform.platformStatic


// TODO: [gettingStarted] Write a main function that prints println in Kotlin and run it
// You can have multiple main functions in your project but only one main function per package
// We already have a main function in exercise B, so this is a workaround
object Main {
    @platformStatic
    fun main(args: Array<String>) {
        println("println")
    }
}
