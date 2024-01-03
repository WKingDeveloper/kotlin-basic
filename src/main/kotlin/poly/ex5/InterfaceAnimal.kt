package poly.ex5

interface InterfaceAnimal {

    /**
     * 코틀린에서는 추상 프로퍼티 선언 가능, 자바능 불가능
     * 하지만 필드 자체에서 어떠한 값을 선언할 수는 없고 getter를 통해 불러올 순 있음.
     */
    //    val name: String

    fun sound()
    fun move()

    /**
     * 자바 최신버전에서 가능한 인터페이스 디폴트 메서드 선언이 코틀린에서 가능
     * 아주 특별한 경우에만 사용해야함.
     */
    fun eat() {
        println("동물이 밥을 먹는다")
    }

}