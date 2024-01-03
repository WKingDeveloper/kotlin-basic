package poly.diamond

fun main() {
    val a: InterfaceA = Child()

    a.methodA()
    a.methodCommon()

    val b: InterfaceB = Child()

    b.methodB()
    b.methodCommon()

    val child = Child()
    child.methodA()
    child.methodB()
    child.methodCommon()

}