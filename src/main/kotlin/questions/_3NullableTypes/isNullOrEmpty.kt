package questions._3NullableTypes

fun main() {
    val s1: String? = null
    val s2: String? = ""
    println(s1.isNullOrEmpty() && s2.isNullOrEmpty())
}

fun String?.isNullOrEmpty(): Boolean = this == null || this.isEmpty()