package final1.ex

class Member(
    val id: String,
    var name: String
) {

    fun changeData(id: String, name: String) {
//        this.id = id // 컴파일 오류 발생
        this.name = name
    }

    fun print() {
        println("id : $id, name : $name")
    }
}