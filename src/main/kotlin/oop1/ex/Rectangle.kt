package oop1.ex

class Rectangle(
    val width: Int,
    val height: Int
) {
    fun calculateArea(): Int {
        val area = width * height
        println("넓이 : ${area}")
        return area
    }

    fun calculatePerimeter(): Int {
        val perimeter = (width + height) * 2
        println("둘레 : ${perimeter}")
        return perimeter
    }

    fun isSquare(): Boolean {
        val isSquare = width == height
        println("정사각형 여부 : ${isSquare}")
        return width == height
    }


}