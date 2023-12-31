package static2.ex

fun main() {
    val values = arrayOf(1, 2, 3, 4, 5)

//    val mathUtils = MathArrayUtils() 에러 발생
    println("sum = ${MathArrayUtils.sum(values)}")
    println("average = ${MathArrayUtils.average(values)}")
    println("min = ${MathArrayUtils.min(values)}")
    println("max = ${MathArrayUtils.max(values)}")
}