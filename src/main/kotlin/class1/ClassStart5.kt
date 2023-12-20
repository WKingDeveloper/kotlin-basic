package class1

fun main() {
    val student1 = Student()
    student1.name = "학생 1"
    student1.age = 16
    student1.grade = 85

    val student2 = Student()
    student2.apply {
        name = "학생 2"
        age = 17
        grade = 90
    }

    var students = arrayOf(student1, student2)

    // 단축키 iter
    for (student in students) {
        println("students : $student 이름 : ${student.name} 나이 : ${student.age} 성적 : ${student.grade}")

    }
}
