package tasks.task3

import kotlin.random.Random

/*
 * Task 3.
 * Define a property that returns a different value on each access.
 */
val foo: Any
    get() = Random.nextInt()

// or
var counter = 0
val foo1: Any
    get() = counter++

fun main() {
    println(foo)
    // should be different:
    println(foo)

    println(foo1)
    println(foo1)
}