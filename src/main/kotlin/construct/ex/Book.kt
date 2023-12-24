package construct.ex

class Book(
    val title: String = "title",
    val author: String = "author",
    val page: Int = 100
) {
    fun displayInfo() {
        println("title = ${title}, author : ${author}, page : ${page}")
    }
}