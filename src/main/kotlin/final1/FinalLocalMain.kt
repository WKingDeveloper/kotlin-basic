package final1

fun main() {

    // 지역 변수 1 코틀린에서는 final 키워드가 별도로 없고 val로 사용된다.
    val data1: Int
    data1 = 10
//    data1 = 20 // 컴파일 오류

    // val 지역 변수2
    val data2 = 10
//    data2 = 20 // 컴파일 오류
}

fun method(parameter: Int) {
//    parameter = 20 // 코틀린에서 매개변수는 항상 val 타입이다.
}