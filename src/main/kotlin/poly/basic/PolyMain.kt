package poly.basic

fun main() {

    // 부모 변수가 부모 인스턴스 참조
    println("Parent -> Parent")
    val parent = Parent()
    parent.parentMethod()

    // 자식 변수가 자식 인스턴스 참조
    println("Child -> Child")
    val child = Child()
    child.parentMethod()
    child.childMethod()

    // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
    println("Parent -> Child")
    val poly: Parent = Child()
    poly.parentMethod()
//    poly.childMethod() // 자식의 기능은 호출할 수 없다. 컴파일 오류 발생

//    val child1: Child = Parent() // 자식은 부모를 담을 수 없다. 컴파일 오류 발생

}