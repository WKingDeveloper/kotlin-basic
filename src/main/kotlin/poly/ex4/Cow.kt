package poly.ex4

class Cow : AbstractAnimal() {
    override fun sound() {
        println("음메")
    }

    override fun move() {
        println("소 이동")
    }
}