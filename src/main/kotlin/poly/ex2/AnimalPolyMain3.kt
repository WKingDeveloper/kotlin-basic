package poly.ex2

fun main() {

    val animalArr: Array<Animal> = arrayOf(Dog(), Cat(), Cow(), Duck(), Pig()) // option + command + n으로 합칠 수 있음

    animalArr.forEach {
        soundAnimal(it) // 함수로 뽑을때 option+ command + m
    }

}

// 변하지 않는 부분
private fun soundAnimal(animal: Animal) {
    println("동물 소리 테스트 시작")
    animal.sound()
    println("동물 소리 테스트 종료")
}