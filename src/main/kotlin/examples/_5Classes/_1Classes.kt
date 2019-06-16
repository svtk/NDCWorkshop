package examples._5Classes

data class Person(val name: String, val age: Int)

fun main() {
    // no new keyword, constructor is called as a regular function
    val person = Person("Alice", 26)

    println(person.name)
}