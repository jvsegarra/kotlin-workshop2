package functional

import helpers.Customer


// TODO: [functional] Create a function that given a list of Customers returns all customers matching a specific name
fun filterCustomers(listOfCustomers: List<Customer>, name: String) : List<Customer> {
    return listOfCustomers.filter { it -> it.name == name }
}