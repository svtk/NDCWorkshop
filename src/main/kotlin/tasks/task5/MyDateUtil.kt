package tasks.task5

import tasks.task4.Month
import tasks.task4.MyDate
import java.util.*

// Utility function used to complete the task.
fun MyDate.addTimeIntervals(timeInterval: TimeInterval, number: Int): MyDate {
    val c = Calendar.getInstance()
    c.set(year, month.ordinal, dayOfMonth)
    when (timeInterval) {
        TimeInterval.DAY -> c.add(Calendar.DAY_OF_MONTH, number)
        TimeInterval.WEEK -> c.add(Calendar.WEEK_OF_MONTH, number)
        TimeInterval.YEAR -> c.add(Calendar.YEAR, number)
    }
    return MyDate(
        c.get(Calendar.YEAR),
        Month.values()[c.get(Calendar.MONTH)],
        c.get(Calendar.DATE)
    )
}