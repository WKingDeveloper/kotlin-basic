package static1

class Data1 {
    var name: String = ""
        private set
    var count: Int = 0
        private set

    constructor(name: String) {
        this.name = name
        count++
    }
}