package poly.ex3

fun main() {
//    val abstractAnimal = AbstractAnimal() // 추상클래스 객체 생성 불가, 에러 발생

    val dog = Dog()
    val cat = Cat()
    val cow = Cow()

    soundAnimal(dog)
    soundAnimal(cat)
    soundAnimal(cow)


}

// 변하지 않는 부분
private fun soundAnimal(animal: AbstractAnimal) {
    println("동물 소리 테스트 시작")
    animal.sound()
    println("동물 소리 테스트 종료")
}