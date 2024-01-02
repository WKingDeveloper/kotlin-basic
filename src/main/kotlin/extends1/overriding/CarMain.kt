package extends1.overriding

fun main() {
    val electricCar = ElectricCar()
    with(electricCar) {
        move()
        charge()
        openDoor()
    }

}