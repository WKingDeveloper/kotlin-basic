package poly.ex6


fun main() {
    val dog = Dog()
    val bird = Bird()
    val chicken = Chicken()

    soundAnimal(dog)
    soundAnimal(bird)
    soundAnimal(chicken)

//    flyAnimal(dog) // dog는 Fly 인터페이스의 구현체가 아니기 때문에 오류 발생
    flyAnimal(bird)
    flyAnimal(chicken)
}

// AbstractAnimal 사용 가능
private fun soundAnimal(animal: AbstractAnimal) {
    println("동물 소리 테스트 시작")
    animal.sound()
    println("동물 소리 테스트 종료")
}

// Fly 인터페이스가 있으면 사용 가능
private fun flyAnimal(fly: Fly) {
    println("날기 테스트 시작")
    fly.fly()
    println("날기 테스트 종료")
}