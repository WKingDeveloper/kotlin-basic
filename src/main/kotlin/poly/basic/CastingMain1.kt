package poly.basic

fun main() {
    // 부모 변수가 자식 인스턴스 참조(다형적 참조)
    val poly: Parent = Child()
    // 단 자식의 기능을 호출할 수 없다.
//    poly.childMethod()

    // 다운 캐스팅 (부모 타입 -> 자식 타입)
    val child: Child = poly as Child
    child.childMethod()

}