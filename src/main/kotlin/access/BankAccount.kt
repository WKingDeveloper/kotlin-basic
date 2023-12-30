package access

class BankAccount {
    var balance: Int = 0
        private set

    fun deposit(amount: Int) {
        if (isAmountValid(amount)) {
            balance += amount
        } else {
            println("유효하지 않은 금액입니다.")
        }
    }

    fun withdraw(amount: Int) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount
        } else {
            println("유효하지 않은 금액이거나 잔액이 부족합니다.")
        }
    }

    private fun isAmountValid(amount: Int): Boolean {
        // 금액이 0보다 커야한다.
        return amount > 0
    }
}