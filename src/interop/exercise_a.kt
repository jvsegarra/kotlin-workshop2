package interop

import helpers.customerList
import junit.framework.Assert
import org.junit.Test

// TODO: [interop] Write a unit test using JUnit and Kotlin assert to test customerList returns non empty list

class Tester {
    Test fun testCustomerListIsNotEmpty() = Assert.assertNotNull(customerList())
}