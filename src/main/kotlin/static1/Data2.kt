package static1

class Data2 {

    var name: String = ""

    constructor(name: String, counter: Counter) {
        this.name = name
        counter.count++
    }
}