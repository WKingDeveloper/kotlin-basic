package poly.ex.pay1

class PayService {

    fun processPay(option: String, amount: Int) {
        println("결제를 시작합니다. option = ${option}, amout = $amount")

        val pay: Pay = when (option) {
            "kakao" -> KaKaoPay()
            "naver" -> NaverPay()
            else -> DefaultPay()
        }

        val result = pay.pay(amount)

        if (result) println("결제가 성공했습니다.") else println("결제가 실패했습니다.")
    }

}
