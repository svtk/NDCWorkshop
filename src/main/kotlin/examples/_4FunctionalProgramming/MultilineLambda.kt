package examples._8Lambdas

fun main() {
    val list = listOf(1, 2, 3)
    list.any {
        println("processing $it")
        it > 0
    }
}