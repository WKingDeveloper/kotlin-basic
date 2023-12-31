package static1

fun main() {
    val data1 = Data3("a")
    println("A count = ${Data3.count}")

    val data2 = Data3("b")
    println("B count = ${Data3.count}")

    val data3 = Data3("c")
    println("C count = ${Data3.count}")

    val data4 = Data3("d")
//    println("D count = ${data4.count}") 자바에서의 static은 다음과 같이 호출이 가능하나 코틀린은 동반객체로 선언해서 안됨. 자바에서도 권장하지 않음

}