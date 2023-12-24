package oop1

fun main() {
    val valueData = ValueData()
    add(valueData)
    add(valueData)
    add(valueData)

    println("최종 숫자  = ${valueData.value}")
}

fun add(valueData: ValueData) {
    valueData.value++
    println("숫자 증가 value = ${valueData.value}")
}