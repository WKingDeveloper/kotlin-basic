package poly.ex.sender

class SmsSender : Sender {

    override fun sendMessage(message: String) {
        println("SMS를 발송합니다: $message")
    }

}