package tasks.day2.task2

import org.junit.Assert
import org.junit.Test
import tasks.day2.task1.Month.*
import tasks.day2.task1.MyDate

class OperatorOverloadingTest {
    @Test fun testAddOneTimeInterval() {
        Assert.assertEquals("Wrong output for task1(MyDate(2014, JUN, 1)",
            MyDate(2015, JUN, 8),
            task1(MyDate(2014, JUN, 1)))
    }

    @Test fun testOneMonth() {
        Assert.assertEquals("Wrong output for task2(MyDate(2014, JAN, 1)",
            MyDate(2016, JAN, 27),
            task2(MyDate(2014, JAN, 1)))
    }

    @Test
    fun testMonthChange() {
        Assert.assertEquals("Wrong output for task2(MyDate(2014, JAN, 25)",
            MyDate(2016, FEB, 20),
            task2(MyDate(2014, JAN, 25)))
    }
}