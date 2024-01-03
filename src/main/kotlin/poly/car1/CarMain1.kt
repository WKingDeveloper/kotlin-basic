package poly.car1

fun main() {
    val driver = Driver()

    // 차량 선택 k3
    val k3Car = K3Car()
    driver.car = k3Car
    driver.drive()

    // 차량 변경 k3 -> model3
    val model3Car = Model3Car()
    driver.car = model3Car
    driver.drive()

    // 차량 변경 model3 -> newCar
    val newCar = NewCar()
    driver.car = newCar
    driver.drive()
}