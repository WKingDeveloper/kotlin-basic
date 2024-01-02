package extends1.access.child

import extends1.access.parent.Parent

class Child : Parent() {

    fun call() {
        publicValue = 1
        protectedValue = 2

        publicMethod()
        protectedMethod()

        printParent()
    }
}