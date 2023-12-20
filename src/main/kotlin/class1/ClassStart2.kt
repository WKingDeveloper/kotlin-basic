package class1

fun main() {
    val studentNames = arrayOf("학생 1", "학생 3", "학생 4")
    val studentAges = arrayOf(15, 17, 20)
    val studentGrades = arrayOf(90, 85, 65)

    for (i in studentNames.indices) {
        println("이름 : ${studentNames[i]} 나이 : ${studentAges[i]} 성적 : ${studentGrades[i]}")
    }
}
