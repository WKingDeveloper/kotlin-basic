package ref

fun main() {
    val dataA = Data(10)
    val dataB = dataA

    println("dataA = $dataA")
    println("dataB = $dataB")

    println("dataA.value = ${dataA.value}")
    println("dataB.value = ${dataB.value}")

    dataA.value = 20
    println("dataA.value = ${dataA.value}")
    println("dataB.value = ${dataB.value}")

    dataB.value = 30
    println("dataA.value = ${dataA.value}")
    println("dataB.value = ${dataB.value}")
}
