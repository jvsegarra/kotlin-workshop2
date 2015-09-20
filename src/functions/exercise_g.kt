package functions

// TODO: [functions] Create an extension function literal to the string class that replaces white spaces with a string
var spaceReplaced = fun String.(char: Char): String = this.replace(' ', char)

val output = "This is an example".spaceReplaced('_')