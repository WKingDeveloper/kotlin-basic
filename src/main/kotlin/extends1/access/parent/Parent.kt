package extends1.access.parent

open class Parent {

    var publicValue = 0
    protected var protectedValue = 0
    private var privateValue = 0

    fun publicMethod() {
        println("Parent.publicMethod")
    }

    protected fun protectedMethod() {
        println("Parent.protectedMethod")
    }

    private fun privateMethod() {
        println("Parent.privateMethod")
    }

    fun printParent() {
        println("==Parent 메서드 안==")
        println("publicValue = ${publicValue}")
        println("protectedValue = ${protectedValue}")
        println("privateValue = ${privateValue}")

        privateMethod()
    }
}