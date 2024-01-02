package poly.basic

fun main() {
    val parent1: Parent = Parent()
    println("parent1 호출")
    call(parent1)
    val parent2: Parent = Child()
    println("parent2 호출")
    call(parent2)
}

fun call(parent: Parent) {
    parent.parentMethod()

    // Child 인스턴스인 경우 childMethod() 실행
    if (parent is Child) {
        println("Child 인스턴스가 맞다.")
        parent.childMethod()
    }
}