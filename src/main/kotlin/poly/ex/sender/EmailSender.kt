package poly.ex.sender

class EmailSender : Sender {

    override fun sendMessage(message: String) {
        println("메일을 발송합니다: $message")
    }
    
}