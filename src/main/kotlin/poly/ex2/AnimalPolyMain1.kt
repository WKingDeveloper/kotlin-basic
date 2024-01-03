package poly.ex2

fun main() {

    val dog = Dog()
    val cat = Cat()
    val cow = Cow()
    val duck = Duck()

    soundAnimal(dog)
    soundAnimal(cat)
    soundAnimal(cow)
    soundAnimal(duck)
}

private fun soundAnimal(animal: Animal) {
    println("동물 소리 테스트 시작")
    animal.sound()
    println("동물 소리 테스트 종료")
}

