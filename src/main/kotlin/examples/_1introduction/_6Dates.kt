package examples._1introduction

import java.time.LocalDate
import java.time.Month

fun main() {
    val now = LocalDate.now()
    val firstOfJune = LocalDate.of(2019, Month.JUNE, 1)
    val endOfJune = LocalDate.of(2019, Month.JUNE, 30)

    println(firstOfJune <= now)   // true
    // the same as:
    firstOfJune.compareTo(now) <= 0

    println(now in (firstOfJune..endOfJune))  // true
    // the same as:
    firstOfJune <= now && now <= endOfJune
}