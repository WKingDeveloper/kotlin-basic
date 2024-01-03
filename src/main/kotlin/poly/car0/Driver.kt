package poly.car0

class Driver {
    lateinit var k3Car: K3Car
    lateinit var model3Car: Model3Car


    fun drive() {
        println("자동차를 운전합니다.")
        if (::k3Car.isInitialized) {
            k3Car.startEngine()
            k3Car.pressAccelerator()
            k3Car.offEngine()
        } else if (::model3Car.isInitialized) {
            model3Car.startEngine()
            model3Car.pressAccelerator()
            model3Car.offEngine()
        }

    }
}