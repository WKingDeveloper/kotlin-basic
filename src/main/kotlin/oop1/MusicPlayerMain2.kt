package oop1

fun main() {
    val data = MusicPlayerData()

    // 음악 플레이어 켜기
    data.isOn = true
    println("음악 플레이어를 시작합니다")

    // 볼륨 증가
    data.volume++
    println("음악 플레이어 볼륨 : ${data.volume}")

    // 볼륨 증가
    data.volume++
    println("음악 플레이어 볼륨 : ${data.volume}")

    // 볼륨 감소
    data.volume--
    println("음악 플레이어 볼륨 : ${data.volume}")

    // 음악 플레이어 상태
    println("음악 플레이어 상태 확인")

    if (data.isOn) println("음악 플레이어 ON, 볼륨 $data.volume") else println("음악 플레이어 Off")
    // 음악 플레이어 끄기
    data.isOn = false
}