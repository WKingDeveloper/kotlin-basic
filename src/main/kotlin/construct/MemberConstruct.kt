package construct

class MemberConstruct {
    var name: String = ""
    var age: Int = 0
    var grade: Int = 0

    constructor(name: String, age: Int) : this(name, age, 50) {
        println("생성자 호출 name = ${name}, age = ${age}")
    }

    constructor(name: String, age: Int, grade: Int) {
        println("생성자 호출 name = ${name}, age = ${age}, grade = ${grade}")
        this.name = name
        this.age = age
        this.grade = grade
    }
}