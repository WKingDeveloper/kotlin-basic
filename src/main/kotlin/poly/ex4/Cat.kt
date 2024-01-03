package poly.ex4

class Cat : AbstractAnimal() {
    override fun sound() {
        println("냐옹")
    }

    override fun move() {
        println("고양이 이동")
    }
}