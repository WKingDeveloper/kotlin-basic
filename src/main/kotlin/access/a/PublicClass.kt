package access.a

public class PublicClass {
}

private class PrivateClass {

}

class DefaultClass1 {

}

class DefaultClass2 {

}

internal class InternalClass {

}


fun main() {
    // public, default, internal은 같은 모듈내에서는 사실 동작이 같음
    // kotlin의 default 가시성은 public이며 internal은 같은 모듈에서만 사용 가능하게 하는 것
    
    val publicClass = PublicClass()
    val privateClass = PrivateClass()
    val defaultClass1 = DefaultClass1()
    val defaultClass2 = DefaultClass2()
    val internalClass = InternalClass()
}