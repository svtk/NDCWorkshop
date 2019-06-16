package examples._1introduction

fun printSeparator(character: Char = '*', size: Int = 10) {
    repeat(size) {
        print(character)
    }
}

fun main() {
    printSeparator('#', 5)  // #####
    println()
    printSeparator('#')          // ##########
    println()
    printSeparator()                      // **********
}