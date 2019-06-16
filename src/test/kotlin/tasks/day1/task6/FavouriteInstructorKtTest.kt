package tasks.day1.task6

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import tasks.day1.task5.Instructor
import tasks.day1.task5.Lesson
import tasks.day1.task5.Student
import tasks.day1.task5.TestSchool

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class FavouriteInstructorKtTest : TestSchool() {
    private fun checkFavouriteInstructor(
        student: Student,
        schoolLessons: List<Lesson>,
        favInstructor: Instructor?
    ) {
        Assert.assertEquals(
            "Wrong result for ${student.name}, $schoolLessons:",
            favInstructor,
            schl(schoolLessons).findFavouriteInstructorForStudent(student)
        )
    }

    @Test
    fun test1() {
        checkFavouriteInstructor(st(1), listOf(lsn('A', 1)), inst('A'))
    }

    @Test
    fun test2() {
        checkFavouriteInstructor(st(2), listOf(lsn('A', 1)), null)
    }


    @Test
    fun test3() {
        checkFavouriteInstructor(st(1), listOf(lsn('A', 1), lsn('B', 1)), inst('A'))
    }

    @Test
    fun test4() {
        checkFavouriteInstructor(
            st(1), listOf(
                lsn('A', 1, 2, 3),
                lsn('B', 1, 2, 3),
                lsn('A', 1)
            ), inst('A')
        )
    }

    @Test
    fun test5() {
        checkFavouriteInstructor(
            st(1), listOf(
                lsn('A', 1, 2, 3),
                lsn('C', 1),
                lsn('B', 2, 3),
                lsn('A', 4),
                lsn('C', 1, 3)
            ), inst('C')
        )
    }
}