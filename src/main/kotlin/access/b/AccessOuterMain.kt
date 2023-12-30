package access.b

import access.a.AccessData

fun main() {
    val data = AccessData()

    // public 호출 가능
    data.publicField = 1
    data.publicMethod()

    // 코틀린에서 default는 public이라 호출 가능
    data.defaultField = 2
    data.defaultMethod()

    // private 호출 불가
//    data.privateField = 3
//    data.privateMethod()

    data.innerAccess()

}