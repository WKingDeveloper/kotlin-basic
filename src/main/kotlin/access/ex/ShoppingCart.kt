package access.ex

class ShoppingCart {
    val items = arrayOfNulls<Item>(10)
    private var itemCount: Int = 0

    fun addItem(item: Item) {
        if (isValidItemSize()) {
            println("더이상 아이템을 추가할 수 없습니다.")
            return
        }

        items[itemCount] = item
        itemCount++
    }

    private fun isValidItemSize(): Boolean {
        return itemCount >= items.size
    }

    fun displayItems() {
        println("장바구니 상품 출력")

        items.forEach {
            it?.let {
                it.showItemInfo()
            }
        }

        println("전체 가격 합 : ${calculateTotalPrice()}")
    }

    private fun calculateTotalPrice(): Int {
        var totalAmount = 0
        items.forEach {
            it?.let {
                totalAmount += it.getTotalPrice()
            }
        }
        return totalAmount
    }
}