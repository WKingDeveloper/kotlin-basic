package poly.ex.sender

class FacebookSender : Sender {

    override fun sendMessage(message: String) {
        println("페이스북에 발송합니다: $message")
    }

}