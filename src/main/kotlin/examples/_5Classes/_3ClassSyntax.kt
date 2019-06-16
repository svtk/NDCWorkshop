package examples._5Classes

class Rectangle(val width: Int, val height: Int) {

    val isSquare: Boolean
        get() = width == height

    init {
        println("in constructor")
    }

    constructor(size: Int) : this(size, size) {}
}

fun main() {
    val rectangle = Rectangle(42)
    println(rectangle.isSquare)  // true
}