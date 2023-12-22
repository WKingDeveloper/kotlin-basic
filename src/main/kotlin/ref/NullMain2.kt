package ref

fun main() {
    var data: Data? = null

    /**
     * 자바의 경우 data.value를 호출하면 NullPointerException 예외 발생
     * 코틀린의 경우 nullable한 타입의 경우 그대로 호출할 수 없고 null 관련 안전한 연산자들을 통해 호출하게 되어
     * 런타임이 아닌 컴파일에서부터 NullPointerException 방지할 수 있음.
     */
    data?.value = 10

    println("data = ${data}")
    println("data = ${data?.value}")

}