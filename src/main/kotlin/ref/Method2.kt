package ref

fun main() {
    val student1 = createStudent(
        "학생 1",
        15,
        90
    )
    println("student1 = $student1")
    val student2 = createStudent(
        "학생 2",
        16,
        80
    )
    println("student2 = $student2")

    printStudent(student1)
    printStudent(student2)
}

private fun createStudent(name: String, age: Int, grade: Int): Student {
    val student = Student()
    student.name = name
    student.age = age
    student.grade = grade

    println("student = $student")
    return student
}

private fun printStudent(student: Student) {
    println("student : $student 이름 : ${student.name} 나이 : ${student.age} 성적 : ${student.grade}")
}