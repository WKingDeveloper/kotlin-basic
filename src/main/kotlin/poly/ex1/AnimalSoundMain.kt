package poly.ex1

fun main() {

    val dog = Dog()
    val cat = Cat()
    val cow = Cow()

    val array = arrayOfNulls<Cow>(3)
    array[0] = cow // cat과 dog는 타입이 다르기에 넣을 수 없다.

    /**
     * 코틀린은 자바와 다르게 배열에 다른 타입을 넣을 수 있다.
     * 자바에서는 타입을 지정하고 배열을 선언하기 때문에 에러가 발생함.
     * 하지만 이렇게 선언할 경우 사이즈를 지정할 수 없는 문제가 발생
     */
    val animal = arrayOf(dog, cat, cow) // 에러가 발생하지 않음
    animal.forEach { println(it.javaClass.simpleName) }


    println("동물 사운드 시작")
    dog.sound()
    println("동물 사운드 종료")

    soundCat(cat)
    soundCow(cow)

}


private fun soundCat(cat: Cat) {
    println("동물 사운드 시작")
    cat.sound()
    println("동물 사운드 종료")
}

private fun soundCow(cow: Cow) {
    println("동물 사운드 시작")
    cow.sound()
    println("동물 사운드 종료")
}