package tasks.task1

/*
 * Task 1.
 * Create a function that checks whether the given string is a valid  identifier.
 * A valid identifier is a non-empty string that starts with a letter
 * or underscore and consists of only letters, digits and underscores.
 */
fun isValidIdentifier(s: String): Boolean {
    fun isValidCharacterV1(ch: Char): Boolean =
        ch == '_' || ch in 'a'..'z' || ch in 'A'..'Z' ||
                ch in '0'..'9'

    fun isValidCharacter(ch: Char): Boolean =
        ch == '_' || ch.isLetterOrDigit()

    if (s.isEmpty() || s[0].isDigit()) return false
    for (ch in s) {
        if (!isValidCharacter(ch)) return false
    }
    return true

}

fun main() {
    println(isValidIdentifier("name"))  // true
    println(isValidIdentifier("0name")) // false
}
