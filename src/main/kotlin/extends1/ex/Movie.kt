package extends1.ex

class Movie(
    name: String,
    private: Int,
    val director: String,
    val actor: String
) : Item(name, private) {

    override fun print() {
        super.print()
        println("- 감독:$director, 배우:$actor")
    }

}