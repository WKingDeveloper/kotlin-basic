package static2

fun main() {
    val s = "hello java"
    val utils = DecoUtil1()
    val deco = utils.deco(s)
    println("before : $s")
    println("after : ${deco}")
}