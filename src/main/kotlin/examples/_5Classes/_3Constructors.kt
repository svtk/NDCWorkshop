package examples._5Classes.constructors

class Rectangle(val height: Int, val width: Int) {

    //secondary constructors
    constructor(side: Int) : this(side, side)
}

fun main() {
    val rectangle = Rectangle(42)
    println(rectangle.height == rectangle.width)
}