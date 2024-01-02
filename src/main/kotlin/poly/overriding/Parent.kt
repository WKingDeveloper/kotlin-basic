package poly.overriding

open class Parent {
    open val value = "parent"

    open fun method() {
        println("Parent.method")
    }
}