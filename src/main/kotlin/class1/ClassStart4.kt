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

    var students = arrayOfNulls<Student>(2)

    students[0] = student1
    students[1] = student2

    students[0]?.let {
        println("students[0] : $students[0] 이름 : ${it.name} 나이 : ${it.age} 성적 : ${it.grade}")
    }

    println("students[1] : $students[1] 이름 : ${students[1]?.name} 나이 : ${students[1]?.age} 성적 : ${students[1]?.grade}")

}
