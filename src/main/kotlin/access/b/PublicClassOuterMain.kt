package access.b

import access.a.DefaultClass1
import access.a.DefaultClass2
import access.a.InternalClass
import access.a.PublicClass

fun main() {
    val publicClass = PublicClass()
//    val privateClass = PrivateClass() private 클래스에 접근하여 에러 발생
    val defaultClass1 = DefaultClass1()
    val defaultClass2 = DefaultClass2()
    val internalClass = InternalClass()
}