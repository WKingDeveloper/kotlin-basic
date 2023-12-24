package construct.ex

fun main() {

    val book1 = Book()
    val book2 = Book("hello java", "seoo")
    val book3 = Book("JPA 프로그래밍", "kim", 800)

    book1.displayInfo()
    book2.displayInfo()
    book3.displayInfo()
}