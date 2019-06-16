package examples._1introduction

fun main() {
    val map = mapOf(1 to "one", 2 to "two")
    map[3]

    val list = mutableListOf(1, 2, 3)
    list += 4
}

class MyDate : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        TODO()
    }
}

fun compareDates(date: MyDate, start: MyDate, end: MyDate) {
    start <= end
    date in start..end
}

/*
a + b	  a.plus(b)
a - b	  a.minus(b)
a * b	  a.times(b)
a / b	  a.div(b)
a % b	  a.rem(b), a.mod(b) (deprecated)
a..b	  a.rangeTo(b)

a > b	  a.compareTo(b) > 0
a < b	  a.compareTo(b) < 0
a >= b	  a.compareTo(b) >= 0
a <= b	  a.compareTo(b) <= 0

a in b	  b.contains(a)
a !in b	  !b.contains(a)

a[i]	      a.get(i)
a[i, j]	      a.get(i, j)
a[i] = b	  a.set(i, b)
a[i, j] = b	  a.set(i, j, b)
*/