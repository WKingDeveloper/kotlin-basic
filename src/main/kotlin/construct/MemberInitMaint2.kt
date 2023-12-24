package construct

fun main() {
    val member1 = MemberInit()
    initMember(member1, "user1", 15, 90)

    val member2 = MemberInit()
    initMember(member2, "user2", 16, 80)

    val members = arrayOf(member1, member2)
    for (member in members) {
        println("이름 : ${member.name}, 나이 : ${member.age}, 성적 : ${member.grade}")
    }
}

fun initMember(memberInit: MemberInit, name: String, age: Int, grade: Int) {
    memberInit.name = name
    memberInit.age = age
    memberInit.grade = grade
}