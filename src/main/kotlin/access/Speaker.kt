package access

class Speaker(
    volume: Int
) {
    var volume = volume
        private set

    fun volumeUp() {
        if (volume >= 100) {
            println("음량을 증가할 수 없습니다. 최대 읍량입니다.")
        } else {
            volume += 10
            println("음량을 10 증가합니다.")
        }
    }

    fun volumeDown() {
        volume -= 10
        println("volumeDown 호출")
    }

    fun showVolume() {
        println("현재 volume = ${volume}")
    }
}