package poly.car0

fun main() {
    val driver = Driver()
    val k3Car = K3Car()

//    driver.k3Car = k3Car

    val model3Car = Model3Car()
    driver.model3Car = model3Car
    
    driver.drive()
}