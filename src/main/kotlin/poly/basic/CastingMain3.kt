package poly.basic

// upcasting vs downcasting
fun main() {

    val child = Child()
    val parent1: Parent = child as Parent // 업캐스팅은 생략이 가능. 생략을 권장함
    val parent2: Parent = child // 업캐스팅은 생략

    parent1.parentMethod()
    parent2.parentMethod()
}