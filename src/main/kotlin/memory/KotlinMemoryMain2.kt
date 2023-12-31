package memory

fun main() {
    println("main start")
    method1()
    println("main end")
}

fun method1() {
    println("method1 start")
    val data1 = Data(10)
    method2(data1)
    println("method1 end")
}

fun method2(data2: Data) {
    println("method2 start")
    println("data2.value = ${data2.value}")
    println("method2 end")
}