package static2

class DecoData {
    var instanceValue = 0
        private set

    companion object {
        var staticValue = 0

        fun staticCall() {
//            instanceValue++  에러 발생
//            instacnceMethod() 에러 발생

            staticValue++
            staticMethod()
        }

        fun staticCall(data: DecoData) {
            data.instanceValue++
            data.instanceMethod()
        }


        private fun staticMethod() {
            println("staticValue = ${staticValue}")
        }

    }

    fun instanceCall() {
        instanceValue++
        instanceMethod()

        staticValue++
        staticMethod()

    }

    private fun instanceMethod() {
        println("instanceValue = ${instanceValue}")
    }
}