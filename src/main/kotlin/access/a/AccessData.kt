package access.a

class AccessData(
    public var publicField: Int = 0,
    var defaultField: Int = 0,
    private var privateField: Int = 0
) {

    public fun publicMethod() {
        println("publicMethod 호출, $publicField")
    }

    fun defaultMethod() {
        println("defaultMethod 호출, $defaultField")
    }

    private fun privateMethod() {
        println("privateMethod 호출, $privateField")
    }

    public fun innerAccess() {
        println("내부 호출")
        publicField = 100
        defaultField = 200
        privateField = 300
        publicMethod()
        defaultMethod()
        privateMethod()
    }
}