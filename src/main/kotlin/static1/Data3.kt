package static1

class Data3 {
    var name: String = ""
        private set

    companion object D3 {
        var count: Int = 0
            private set
    }

    constructor(name: String) {
        this.name = name
        count++
    }

}

