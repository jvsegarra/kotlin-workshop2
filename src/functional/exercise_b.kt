package functional

import helpers.Customer


// TODO: [functional] Create a function that given a list of Customers, it converts to uppercase all those that live in a specific country defined also as parameter
fun filterAndConvertCustomers(listOfCustomers: List<Customer>, country: String): List<String> {
    return listOfCustomers.filter { it -> it.country == country }.map { it.country.toUpperCase() }
}