package construct

class MemberInit {

    var name: String = ""
    var age: Int = 0
    var grade: Int = 0

    fun initMember(name: String, age: Int, grade: Int) {
        this.name = name
        this.age = age
        this.grade = grade
    }
}