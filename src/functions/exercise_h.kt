package functions


// TODO: [functions] Create a function that takes a string as first parameter and a function that takes no parameters and
//       returns nothing as second parameter. Call it using convention of omitting () on second parameter
fun lambdaParams(firstParam: String, lambdaParam: () -> Unit ) {}

val f = lambdaParams("string", {})