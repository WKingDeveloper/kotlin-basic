package poly.overriding

fun main() {

    // 자식 변수가 자식 인스턴스 참조
    val child = Child()
    println("Child -> Child")
    println("value = ${child.value}")
    child.method()

    // 부모 변수가 부모 인스턴스 참조
    val parent = Parent()
    println("Parent -> Parent")
    println("value = ${parent.value}")
    parent.method()

    // 부모 변수가 자식 인스턴스 참조
    val poly: Parent = Child()
    println("Parent -> Child")
    println("value = ${poly.value}") // 자바에서는 필드 오버리이딩 개념이 없어 parent가 출력이 되나 코틀린은 필드 오버라이딩 개념이 존재해 "Child" 가 출력
    poly.method() // Child의 method가 호출
}