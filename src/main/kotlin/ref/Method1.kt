package ref

fun main() {
    val student1 = Student()
    student1.apply {
        name = "학생 1"
        age = 15
        grade = 90
    }

    val student2 = Student()
    initStudent(student2, "학생 2", 16, 80)

    printStudent(student1)
    printStudent(student2)
}

private fun initStudent(student: Student, name: String, age: Int, grade: Int) {
    student.name = name
    student.age = age
    student.grade = grade
}

private fun printStudent(student: Student) {
    println("student : $student 이름 : ${student.name} 나이 : ${student.age} 성적 : ${student.grade}")
}