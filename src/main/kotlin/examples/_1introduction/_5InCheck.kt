package examples._1introduction

fun isDigit(c: Char) = '0' <= c && c <= '9'

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isNotDigit(c: Char) = c !in '0'..'9'


fun main() {
    println(isDigit('x')) // false

    if (4 in setOf(1, 2, 3)) { /* ... */ }
}