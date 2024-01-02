package extends1.ex2

fun main() {
    val electricCar = ElectricCar()
    electricCar.move()
    electricCar.charge()

    val gasCar = GasCar()
    gasCar.move()
    gasCar.fillUp()
}