package poly.ex.pay1

fun main() {
    val payService = PayService()

    // 카카오 결제
    val payOption1 = "kakao"
    val amount1 = 5000
    payService.processPay(payOption1, amount1)

    // naver 결제
    val payOption2 = "naver"
    val amount2 = 10000
    payService.processPay(payOption2, amount2)

    // 잘못된 결제
    val payOption3 = "bad"
    val amount3 = 15000
    payService.processPay(payOption3, amount3)

}