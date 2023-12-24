package construct

fun main() {
    val member1 = MemberConstruct("user1", 16, 90)
    val member2 = MemberConstruct("user2", 17, 80)
    val members = arrayOf(member1, member2)
    for (member in members) {
        println("이름 : ${member.name}, 나이 : ${member.age}, 성적 : ${member.grade}")
    }
}