package poly.ex.sender

fun main() {
    val senders = arrayOf(EmailSender(), SmsSender(), FacebookSender())

    senders.forEach { it.sendMessage("환영합니다.") }
}