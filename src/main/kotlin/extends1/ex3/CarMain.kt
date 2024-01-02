package extends1.ex3

fun main() {
    val electricCar = ElectricCar()
    val with = with(electricCar) {
        move()
        charge()
        openDoor()
        "with"
    }

    println("with : $with")

    val gasCar = GasCar()
    val run = gasCar.run {
        move()
        fillUp()
        openDoor()
        "run"
    }

    println("run : $run")


    val hydrogenCar = HydrogenCar()
    val apply = hydrogenCar.apply {
        move()
        fillHydrogen()
        openDoor()
        "apply"
    }

    println("apply : $apply")


}