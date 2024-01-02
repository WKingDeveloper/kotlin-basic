package extends1.overriding

open class Car {

    open fun move() {
        println("차를 이동합니다.")
    }

    fun openDoor() {
        println("문을 엽니다.")
    }
}