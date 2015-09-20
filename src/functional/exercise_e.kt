package functional

// TODO: [functional] Create FizzBuzz
fun Int.divides(d: Int): Boolean = this % d == 0

fun main(args: Array<String>): Unit {
    for (i in 0..100) {
        println(
                when {
                    i divides 15 -> "fizzbuzz"
                    i divides 3 -> "fizz"
                    i divides 5 -> "buzz"
                    else -> "$i"
                }
        )
    }
}