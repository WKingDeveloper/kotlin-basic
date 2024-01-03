package poly.car1

class K3Car : Car {

    override fun startEngine() {
        println("K3Car.startEngine")
    }

    override fun offEngine() {
        println("K3Car.offEngine")
    }

    override fun pressAccelerator() {
        println("K3Car.pressAccelerator")
    }
}