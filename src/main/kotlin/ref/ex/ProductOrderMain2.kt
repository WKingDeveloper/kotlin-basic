package ref.ex

fun main() {
    val order1 = ProductOrder("두부", 2000, 2)
    val order2 = ProductOrder("김치", 5000, 1)
    val order3 = ProductOrder("콜라", 1500, 2)

    val orders = arrayOf(order1, order2, order3)
    printOrders(orders)

    val totalAmount = getTotalAmount(orders)
    println("총 결제 금액 : $totalAmount")
}

private fun getTotalAmount(orders: Array<ProductOrder>) = orders.sumOf { it.price * it.quantity }

private fun printOrders(orders: Array<ProductOrder>) {
    orders.forEach {
        println("상품명 : ${it.productName}, 가격: ${it.price}, 수량 : ${it.quantity}")
    }
}