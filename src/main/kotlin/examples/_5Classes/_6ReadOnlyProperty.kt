package examples._5Classes

import java.util.*

val foo: Int
    get() = Random().nextInt()

fun main() {
    println(foo)
    println(foo)
}