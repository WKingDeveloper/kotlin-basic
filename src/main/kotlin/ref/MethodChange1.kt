package ref

fun main() {
    var a = 10
    println("메소드 호출 전 a = $a")

    changePrimitive(a)
    println("메소드 호출 후 a = $a")
}

private fun changePrimitive(x: Int) {
    var a = x
    a = 20
}