package extends1.super2

class ClassC : ClassB {

    constructor() : super(10, 20) { // super 생략 불가능. 기본 생성자가 아니기 때문
        println("ClassC 생성자")
    }
}