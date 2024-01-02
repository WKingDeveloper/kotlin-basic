package extends1.ex

class Book(
    name: String,
    private: Int,
    val author: String,
    val isbn: String
) : Item(name, private) {

    override fun print() {
        super.print()
        println("- 저자:$author, isbn:$isbn")
    }

}