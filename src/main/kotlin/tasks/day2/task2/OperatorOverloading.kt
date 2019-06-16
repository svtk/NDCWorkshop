package tasks.day2.task2

import tasks.day2.task1.MyDate
import tasks.day2.task2.TimeInterval.*

/*
 * Implement a kind of date arithmetic. Support adding years, weeks and days to a date.
 * You could be able to write the code like this: date + YEAR * 2 + WEEK * 3 + DAY * 15.
 *
 * At first, add an extension function 'plus()' to MyDate,
 * taking a TimeInterval as an argument.
 * Use an utility function MyDate.addTimeIntervals() declared in MyDateUtil.kt
 *
 * Then, support adding several time intervals to a date.
 * You may need an extra class for that.
 */

enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = TODO()

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    TODO("Uncomment") //return today + YEAR * 2 + WEEK * 3 + DAY * 5
}