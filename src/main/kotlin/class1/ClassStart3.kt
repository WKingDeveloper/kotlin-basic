package class1

fun main() {
    val student1: Student
    student1 = Student()
    student1.name = "학생 1"
    student1.age = 16
    student1.grade = 85

    val student2: Student
    student2 = Student()
    student2.apply {
        name = "학생 2"
        age = 17
        grade = 90
        println("student1 : $this 이름 : $name 나이 : $age 성적 : $grade")
    }

    val student3 = Student()
    val student4: Student = Student()

    student1.let {
        println("student2 : $it 이름 : ${it.name} 나이 : ${it.age} 성적 : ${it.grade}")
    }

    println("student3 : $student3 이름 : ${student3.name} 나이 : ${student3.age} 성적 : ${student3.grade}")
    println("student4 : $student4 이름 : ${student4.name} 나이 : ${student4.age} 성적 : ${student4.grade}")

}
