package final1


fun main() {

    // 생성자
    println("생성자 초기화")
    val constructInit1 = ConstructInit(10)
    val constructInit2 = ConstructInit(20)

    println("constructInit1.value = ${constructInit1.value}")
    println("constructInit2.value = ${constructInit2.value}")

    // 필드
    println("필드 초기화")
    val fieldInit1 = FieldInit()
    val fieldInit2 = FieldInit()
    val fieldInit3 = FieldInit()

    println("fieldInit1.value = ${fieldInit1.value}")
    println("fieldInit2.value = ${fieldInit2.value}")
    println("fieldInit3.value = ${fieldInit3.value}")


    // 상수
    println("상수")
    println("FieldInit.CONST_VALUE : ${FieldInit.CONST_VALUE}")
}