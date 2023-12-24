package oop1.ex

fun main() {
    val account = Account()
    account.deposit(10000)
    account.withdraw(9000)
    account.withdraw(2000)
    account.showBalance()
}