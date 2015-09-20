package functional

import helpers.Customer

// TODO: [functional] Create a function that given a list of Customers, it groups them by country and also converts each name to proper case
fun groupAndConvertCustomers(listOfCustomers: List<Customer>): Map<String, List<Customer>> {
    return listOfCustomers.groupBy { it -> it.country }
}