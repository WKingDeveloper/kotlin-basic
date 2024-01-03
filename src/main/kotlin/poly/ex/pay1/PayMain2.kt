package poly.ex.pay1

import java.util.*

fun main() {
    val payService = PayService()

    while (true) {
        val scanner = Scanner(System.`in`)
        println("결제 수단을 입력해 주세요 : ")
        val name = scanner.next()
        if (name == "exit") break

        println("결제 금액을 입력해 주세요 : ")
        val amount = scanner.nextInt()

        payService.processPay(name, amount)
        scanner.nextLine()
    }

    println("프로그램을 종료합니다.")

}