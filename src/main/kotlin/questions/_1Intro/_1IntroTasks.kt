package questions._1Intro

fun main() {
    var string = 1
    // the variable string has type Int
//    string = "a"

    val languages = listOf("Java")
    // list is read-only
//    languages.add("Kotlin")

    println(listOf('a', 'b', 'c').joinToString(
            separator = "", prefix = "(", postfix = ")"))
    // (abc)

    println("Kotlin" in "Java".."Scala") // true
    // "Java" <= "Kotlin" && "Kotlin" <= "Scala"

    println("Kotlin" in setOf("Java", "Scala"))  // false

    val list = mutableListOf("Kotlin", "Java", "Scala")
    list.sort()
    println(list)
}