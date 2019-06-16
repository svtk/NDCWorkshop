package tasks.task5

import tasks.task4.MyDate
import tasks.task5.TimeInterval.*

/*
 * Task 5.
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

operator fun MyDate.plus(timeInterval: TimeInterval) =
    addTimeIntervals(timeInterval, 1)

class RepeatedTimeInterval(val timeInterval: TimeInterval, val number: Int)

operator fun TimeInterval.times(number: Int) = RepeatedTimeInterval(this, number)

operator fun MyDate.plus(timeIntervals: RepeatedTimeInterval) =
    addTimeIntervals(timeIntervals.timeInterval, timeIntervals.number)

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}