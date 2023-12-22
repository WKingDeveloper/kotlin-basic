package ref.ex

import java.util.*

val scanner = Scanner(System.`in`)

fun main() {

    print("입력할 주문의 개수를 입력하세요 : ")
    val orders = Array(scanner.nextInt()) { ProductOrder() }
    setProductOrders(orders)
    printOrders(orders)
    println("총 결제 금액 : ${getTotalAmount(orders)}")
}

private fun setProductOrders(orders: Array<ProductOrder>) {
    for ((i, order) in orders.withIndex()) {
        println("${i + 1}번째 주문 정보를 입력하세요")
        print("상품명 : ")
        order.productName = scanner.next()
        print("가격 : ")
        order.price = scanner.nextInt()
        print("수량 : ")
        order.quantity = scanner.nextInt()
        scanner.nextLine() // 입력 버퍼를 비우기 위한 코드
    }
}

private fun getTotalAmount(orders: Array<ProductOrder>) = orders.sumOf { it.price * it.quantity }

private fun printOrders(orders: Array<ProductOrder>) {
    orders.forEach {
        println("상품명 : ${it.productName}, 가격: ${it.price}, 수량 : ${it.quantity}")
    }
}