package examples._1introduction

fun main() {
    // list map withIndex ranges
    val list = listOf("a", "ab", "ac")
    for (s in list) {
        println(s)
    }

    val map = mapOf(1 to "one", 2 to "two")
    for ((key, value) in map) {
        println("$key = $value")
    }

    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }

    for (i in 0..10) { /*...*/}

    for (i in 0 until 10) { /*...*/}
}