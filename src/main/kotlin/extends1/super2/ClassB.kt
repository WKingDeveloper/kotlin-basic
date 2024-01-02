package extends1.super2

open class ClassB : ClassA {

    constructor(a: Int) : super() {  // 상위 클래스 생성자 명시적으로 호출, super() 생략 가능
        println("ClassB 생성자 a = $a")
    }

    constructor(a: Int, b: Int) {  // super() 생략
        println("ClassB 생성자 a = $a, b = $b")
    }

}