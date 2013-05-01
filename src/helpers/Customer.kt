package helpers

public class Customer(var name: String, var country: String, var email: String) {

}

public fun customerList(): List<Customer> {

    return listOf<Customer>(
        Customer("Joe Smith", "UK", "joe@joesmith.com"),
        Customer("Jack Jones", "France", "jack@gmail.com"),
        Customer("Will Frank", "Spain", "will@frank.com"),
        Customer("Ann May", "UK", "ann@may.com"),
        Customer("Jennifer Ferdinand" , "USA", "jenny@gmail.com")
    )

}