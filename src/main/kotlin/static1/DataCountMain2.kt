package static1

fun main() {
    val counter = Counter()

    val data1 = Data2("A", counter)
    println("A count = ${counter.count}")

    val data2 = Data2("B", counter)
    println("B count = ${counter.count}")

    val data3 = Data2("C", counter)
    println("C count = ${counter.count}")
}