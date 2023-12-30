package access.ex

class MaxCounter(
    val max: Int
) {
    var count: Int = 0
        private set

    fun increment() {
        if (isValidCount()) {
            count++
        } else {
            println("최대값을 초과할 수 없습니다.")
        }
    }

    private fun isValidCount(): Boolean {
        return count < max
    }
}