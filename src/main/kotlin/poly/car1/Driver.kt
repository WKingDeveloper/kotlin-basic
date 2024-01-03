package poly.car1

class Driver {
    lateinit var car: Car
    
    fun drive() {
        println("자동차를 운전합니다.")
        if (::car.isInitialized) {
            car.startEngine()
            car.pressAccelerator()
            car.offEngine()
        }
    }
}