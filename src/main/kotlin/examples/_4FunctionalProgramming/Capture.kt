package examples._8Lambdas

fun main() {

    val increment = 1
    var sum = 0

    val inc = {
        println(increment)
        sum += increment
    }

    inc()
    inc()
}