package tasks.day1.task3

import org.junit.Assert
import org.junit.Test

class UnstableValKtTest {
    @Test
    fun testUnstableValKt() {
        Assert.assertNotEquals(
            "Different invocations should return different values",
            foo,
            foo)
    }
}