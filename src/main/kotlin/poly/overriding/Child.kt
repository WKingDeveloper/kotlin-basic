package poly.overriding

class Child : Parent() {

    override val value = "Child"

    override fun method() {
        println("Child.method")
    }
}