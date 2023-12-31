package static2

//import static2.DecoData.Companion.staticCall

fun main() {
    println("1. 정적 호출")
    DecoData.staticCall()


    println("2. 인스턴스 호출1")
    val data1 = DecoData()
    data1.instanceCall()

    println("3. 인스턴스 호출1")
    val data2 = DecoData()
    data2.instanceCall()

    DecoData.staticCall(data1)

    val data3 = DecoData()
}