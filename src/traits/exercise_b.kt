package traits

import kotlin.platform.platformStatic

// TODO: [traits] Create a Customer Controller class that delegates the customer repository functionality to the trait created in exercise_a
class CustomerController : customerRepository {}

object Main {
    @platformStatic
    fun main(args: Array<String>) {
        val c = CustomerController()
        c.getAll()
        c.findByName()
    }
}