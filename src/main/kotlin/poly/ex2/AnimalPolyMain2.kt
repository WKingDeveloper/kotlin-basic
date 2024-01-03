package poly.ex2

fun main() {

    val dog = Dog()
    val cat = Cat()
    val cow = Cow()
    val duck = Duck()

    val animalArr: Array<Animal> = arrayOf(dog, cat, cow, duck)

    animalArr.forEach {
        println("동물 소리 테스트 시작")
        it.sound()
        println("동물 소리 테스트 종료")
    }

}