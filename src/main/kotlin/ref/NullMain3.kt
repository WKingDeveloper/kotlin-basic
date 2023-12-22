package ref

fun main() {
    val bigData = BigData()

    println("bigData.count = ${bigData.count}")
    println("bigData.data = ${bigData.data}")

    // 자바의 경우 NPE 에러 발생 지점 data가 null이라서.
    println("bigData.data.value = ${bigData.data?.value}")

}