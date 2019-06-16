package tasks.day2.task5

import org.junit.Assert
import org.junit.Test

class BreakfastMenuItemTest {
    @Test
    fun testSample() {
        val expectedMenu = BreakfastMenu(
            listOf(BreakfastMenuItem(
                name = "Belgian Waffles",
                price = 5.95,
                calories = 650
            ),
            BreakfastMenuItem(
                name = "Strawberry Belgian Waffles",
                price = 7.95,
                calories = 900
            ),
            BreakfastMenuItem(
                name = "Berry-Berry Belgian Waffles",
                price = 8.95,
                calories = 900
            ),
            BreakfastMenuItem(
                name = "French Toast",
                price = 4.5,
                calories = 600
            ),
            BreakfastMenuItem(
                name = "Homestyle Breakfast",
                price = 6.95,
                calories = 950
            ))
        )
        Assert.assertEquals(
            expectedMenu,
            buildMenu()
        )
    }
}