package access.ex

fun main() {
    val cart = ShoppingCart()

    val item1 = Item("마늘", 2000, 2)
    val item2 = Item("상추", 3000, 4)

    cart.addItem(item1)
    cart.addItem(item2)

    cart.displayItems()
}