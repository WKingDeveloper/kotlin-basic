package final1

fun main() {
    println("프로그램 최대 참여자 수 : $MAX_USERS")

    var currentUserCount = 999
    process(currentUserCount++)
    process(currentUserCount++)
    process(currentUserCount++)
    process(currentUserCount++)
    process(currentUserCount++)

}

private fun process(currentUserCount: Int) {
    println("참여자 수 : $currentUserCount")
    if (currentUserCount >= MAX_USERS) println("대기자로 등록합니다.") else println("게임에 참여합니다.")
}