package ref

fun main() {
    var data: Data? = null
    println("1. data = ${data}")

    data = Data()
    println("2. data = ${data}")

    data = null
    println("3. data = ${data}")
}