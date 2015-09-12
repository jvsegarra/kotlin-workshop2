package gettingStarted


// TODO: [gettingStarted] Create a function with a nullable type as parameter and force usage of it even if not null
fun withNullableType(param: String?) {
   param!!.capitalize()
}