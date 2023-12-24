package construct

fun main() {
    val member1 = MemberInit()
    member1.initMember("user1", 15, 90)

    val member2 = MemberInit()
    member2.initMember("user2", 16, 80)

    val members = arrayOf(member1, member2)
    for (member in members) {
        println("이름 : ${member.name}, 나이 : ${member.age}, 성적 : ${member.grade}")
    }
}
