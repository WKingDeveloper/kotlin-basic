package poly.ex6

class Chicken : AbstractAnimal(), Fly {
    override fun sound() {
        println("꼬끼오")
    }

    override fun fly() {
        println("닭 날기")
    }
}