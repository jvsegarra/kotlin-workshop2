package classBasics

// TODO: [classBasics] Create a class with an inner class and see how you can reference a property of the outer class
class Outer {
    private val outerProperty: Int = 1
    inner class Nested {
        fun foo() = outerProperty
    }
}

val demo = Outer().Nested().foo() // == 1