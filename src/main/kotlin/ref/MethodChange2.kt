package ref

fun main() {
    var dataA = Data(10)
    println("메소드 호출 전 dataA.value = ${dataA.value}")

    println("dataA = $dataA")
    changeReference(dataA)
    println("메소드 호출 후 dataA.value = ${dataA.value}")
}

private fun changeReference(dataX: Data) {
    println("dataX = $dataX")
    dataX.value = 20
}