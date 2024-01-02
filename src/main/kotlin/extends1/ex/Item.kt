package extends1.ex

open class Item(
    val name: String,
    val price: Int
) {

    open fun print() {
        println("이름 : $name, 가격 : $price")
    }
}