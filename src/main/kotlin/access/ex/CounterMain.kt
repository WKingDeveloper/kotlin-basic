package access.ex

fun main() {
    val counter = MaxCounter(3)
    counter.increment()
    counter.increment()
    counter.increment()
    counter.increment()
    println(counter.count)
}