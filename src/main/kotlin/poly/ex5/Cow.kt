package poly.ex5

class Cow : InterfaceAnimal {
    override fun sound() {
        println("음메")
    }

    override fun move() {
        println("소 이동")
    }
}