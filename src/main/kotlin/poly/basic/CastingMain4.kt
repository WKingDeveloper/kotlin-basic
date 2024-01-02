package poly.basic

// 다운 캐스팅을 자동으로 하지 않는 이유
fun main() {
    val parent1: Parent = Child()
    val child1: Child = parent1 as Child
    child1.childMethod()

    val parent2 = Parent()
    val child2: Child = parent2 as Child // 런타임 오류 ClassCastException

    child2.childMethod() // 실행 불가

}