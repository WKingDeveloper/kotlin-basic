package extends1.overriding

class ElectricCar : Car() {

    override fun move() {
        println("전기차를 빠르게 이동합니다.")
    }

    fun charge() {
        println("충전합니다.")
    }
}