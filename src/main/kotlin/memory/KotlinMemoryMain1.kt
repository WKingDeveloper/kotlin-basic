package memory

fun main() {
    println("main start")
    method1(10)
    println("main end")
}

fun method1(m1: Int) {
    println("method1 start")
    val cal = m1 * 2
    method2(cal)
    println("method1 end")
}

fun method2(m2: Int) {
    println("method2 start")
    println("method2 end")
}