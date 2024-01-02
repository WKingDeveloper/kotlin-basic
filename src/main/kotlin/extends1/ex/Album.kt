package extends1.ex

class Album(
    name: String,
    private: Int,
    val artist: String
) : Item(name, private) {

    override fun print() {
        super.print()
        println("- 아티스트:$artist")
    }

}