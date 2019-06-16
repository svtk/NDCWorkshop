package examples._6Nullability

class A(val value: Int)

fun foo(a: Any?) = (a as? A)?.value

fun main() {
    println(foo(A(42)))   // 42
    println(foo(42))         // null
    println(foo(null))       // null
}

fun test(a: Any) {
    val s = if (a is String) a else null
    // ...
}