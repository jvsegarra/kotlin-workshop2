package functional

import java.util.*


// TODO: [functional] Create a function that prints "[key is value]" of hashmap entries to the console. Use multideclarations
fun prints(map: HashMap<Int, String>) {
    for ((key, value) in map) {
        println("$key is $value")
    }
}