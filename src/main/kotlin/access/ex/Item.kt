package access.ex

class Item(
    val name: String,
    price: Int,
    quantity: Int
) {
    var price = price
        private set

    var quantity = quantity
        private set

    fun showItemInfo() {
        println("상품명 : $name, 합계 : ${getTotalPrice()}")
    }

    fun getTotalPrice(): Int {
        return price * quantity
    }
}