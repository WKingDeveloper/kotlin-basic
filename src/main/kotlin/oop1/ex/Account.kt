package oop1.ex

class Account(
    var balance: Int = 0
) {
    fun deposit(amount: Int) {
        balance += amount
    }

    fun withdraw(amount: Int) {
        return if (balance - amount < 0) {
            println("잔액 부족")
        } else {
            balance -= amount
        }
    }

    fun showBalance() {
        println("잔고 : ${balance}")
    }

}