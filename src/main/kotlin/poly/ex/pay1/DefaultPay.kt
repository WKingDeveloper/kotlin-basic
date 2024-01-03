package poly.ex.pay1

class DefaultPay : Pay {
    override fun pay(amunt: Int): Boolean {
        println("결제 수단이 존재하지 않습니다")
        return false
    }
}
