package poly.ex5

fun main() {

//    val interfaceAnimal = InterfaceAnimal() // 인터페이스 생성 불가, 컴파일 오류
    val dog = Dog()
    val cat = Cat()
    val cow = Cow()


    soundAnimal(dog)
    soundAnimal(cat)
    soundAnimal(cow)
}

private fun soundAnimal(animal: InterfaceAnimal) {
    println("동물 소리 테스트 시작")
    animal.sound()
    println("동물 소리 테스트 종료")
}