package oop1

fun main() {
    var volume = 0
    var isOn = false

    // 음악 플레이어 켜기
    isOn = true
    println("음악 플레이어를 시작합니다")

    // 볼륨 증가
    volume++
    println("음악 플레이어 볼륨 : ${volume}")

    // 볼륨 증가
    volume++
    println("음악 플레이어 볼륨 : ${volume}")

    // 볼륨 감소
    volume--
    println("음악 플레이어 볼륨 : ${volume}")

    // 음악 플레이어 상태
    println("음악 플레이어 상태 확인")
    
    if (isOn) println("음악 플레이어 ON, 볼륨 $volume") else println("음악 플레이어 Off")
    // 음악 플레이어 끄기
    isOn = false
}