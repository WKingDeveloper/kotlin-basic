package access

fun main() {
    val account = BankAccount()
    account.deposit(10000)
    account.withdraw(3000)
    println("balance = ${account.balance}")
}