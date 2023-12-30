package access

fun main() {
    val speaker = Speaker(90)
    speaker.volumeUp()
    speaker.showVolume()

    speaker.volumeUp()
    speaker.showVolume()

    speaker.volumeUp()
    speaker.showVolume()

    // 필드에 직접 접근
    println("volume 필드 직접 접근 수정")
//    speaker.volume = 200
    speaker.showVolume()
}