package objects

import classBasics.UserKotlin


// TODO: [objects] Create an anonymous object that inherits from the user class created in classBasics
val anonymousObjectInherited = object : UserKotlin("jv2", "segarra2", 35) {
    val property1: Int = 0
    val property2: String = "example"
}