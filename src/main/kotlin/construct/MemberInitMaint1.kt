package construct

fun main() {
    val member1 = MemberInit()
    member1.apply {
        name = "user1"
        age = 15
        grade = 90
    }

    val member2 = MemberInit()
    member2.apply {
        name = "user2"
        age = 16
        grade = 80
    }

    val members = arrayOf(member1, member2)
    for (member in members) {
        println("이름 : ${member.name}, 나이 : ${member.age}, 성적 : ${member.grade}")
    }
}