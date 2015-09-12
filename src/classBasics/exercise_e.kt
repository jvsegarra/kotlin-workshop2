package classBasics

// TODO: [classBasics] Create an instance of previous class and call toString(). What happens?
class createUserInstances() {
    fun createInstances() {
        val userKotlin = UserKotlin("jv", "segarra", 35)
        println(userKotlin.toString())
    }
}


// TODO: [classBasics] What happens when you compare two instances?
class compareUserInstances() {
    fun compareInstances() {
        val userKotlin1 = UserKotlin("jv", "segarra", 35)
        val userKotlin2 = UserKotlin("jv", "segarra", 35)
        println(userKotlin1.equals(userKotlin2) )
    }
}

