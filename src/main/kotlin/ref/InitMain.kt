package ref

fun main() {
    val data = InitData()
    /**
     * 자바의 경우라면 value1의 멤버변수를 초기화 하지 않았더라도 기본값이 지정되나 코틀린은 초기화하지 않으면 에러 발생
     */
    println("data.value1 = ${data.value1}")
    println("data.value2 = ${data.value2}")
}