package tasks.task1

/*
 * Task 1.
 * Create a function that checks whether the given string is a valid  identifier.
 * A valid identifier is a non-empty string that starts with a letter
 * or underscore and consists of only letters, digits and underscores.
 */
fun isValidIdentifier(s: String): Boolean {
    TODO()
}

fun main() {
    println(isValidIdentifier("name"))  // true
    println(isValidIdentifier("0name")) // false
}
