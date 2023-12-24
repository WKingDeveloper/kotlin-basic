package oop1

fun main() {
    val data = MusicPlayerData()

    // 음악 플레이어 켜기
    on(data)
    // 볼륨 증가
    volumeUp(data)
    // 볼륨 증가
    volumeUp(data)
    // 볼륨 감소
    volumeDown(data)
    // 음악 플레이어 상태
    showStatus(data)
    // 음악 플레이어 끄기
    off(data)
}

fun on(data: MusicPlayerData) {
    data.isOn = true
    println("음악 플레이어를 시작합니다")
}

fun off(data: MusicPlayerData) {
    data.isOn = false
    println("음악 플레이어를 종료합니다")
}

fun volumeUp(data: MusicPlayerData) {
    data.volume++
    println("음악 플레이어 볼륨 : ${data.volume}")
}

fun volumeDown(data: MusicPlayerData) {
    data.volume--
    println("음악 플레이어 볼륨 : ${data.volume}")
}

fun showStatus(data: MusicPlayerData) {
    println("음악 플레이어 상태 확인")
    if (data.isOn) println("음악 플레이어 ON, 볼륨 ${data.volume}") else println("음악 플레이어 Off")
}