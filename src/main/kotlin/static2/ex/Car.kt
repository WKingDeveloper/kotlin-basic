package static2.ex

class Car {
    var name = ""
        private set

    constructor(name: String) {
        this.name = name
        count++
        println("차량 구입, 이름: ${this.name}")
    }

    companion object {
        private var count = 0

        fun showTotalCars() {
            println("구매한 차량 수 : $count")
        }
    }


}