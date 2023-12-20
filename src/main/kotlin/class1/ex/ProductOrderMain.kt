package class1.ex

fun main() {

    val order1 = ProductOrder(
        "두부",
        2000,
        2
    )

    val order2 = ProductOrder(
        "김치",
        5000,
        1
    )

    val order3 = ProductOrder(
        "콜라",
        1500,
        2
    )

    val orders = arrayOf(order1, order2, order3)

    var totalAmount = 0

    for (order in orders) {
        println("상품명 : ${order.productName}, 가격: ${order.price}, 수량 : ${order.quantity}")
        totalAmount += order.price * order.quantity
    }

    println("총 결제 금액 : $totalAmount")

}