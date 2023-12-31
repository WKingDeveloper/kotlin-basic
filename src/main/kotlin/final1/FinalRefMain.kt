package final1

fun main() {
    val data = Data()
//    data = Data() // 컴파일 에러 발생
    data.value = 10
    println("data.value = ${data.value}")
    data.value = 20
    println("data.value = ${data.value}")

    var data2 = Data()
    data2 = Data()
}