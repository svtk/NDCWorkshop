package tasks.task4

import tasks.task4.Month.*

/*
 * Task 4.
 * Make the custom MyDate class implement Comparable<MyDate>.
 * Uncomment the code below and make it compile.
 */

enum class Month {
    JAN, FEB, MAR, APR, MAY, JUN,
    JUL, AUG, SEP, OCT, NOV, DEC
}

data class MyDate(
    val year: Int,
    val month: Month,
    val dayOfMonth: Int
): Comparable<MyDate> {
    override fun compareTo(other: MyDate) = when {
        year != other.year -> year - other.year
        month != other.month -> month.ordinal - other.month.ordinal
        else -> dayOfMonth - other.dayOfMonth
    }
}

fun compareDates(date1: MyDate, date2: MyDate): Boolean =
         date1 < date2

fun checkInRange(date: MyDate, start: MyDate, end: MyDate): Boolean =
         date in start..end

fun main() {
    val date1 = MyDate(2018, OCT, 3)
    val date2 = MyDate(2018, OCT, 4)

    // Uncomment the following code and make it compile:
    println(date1 < date2)  // true
    println(MyDate(2018, SEP, 21) !in date1..date2)  // false
}