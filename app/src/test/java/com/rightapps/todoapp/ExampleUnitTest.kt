package com.rightapps.todoapp

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    fun addNumbers(x: Long, y: Long): Long {

        val result = x + y
        println("x=$x, y=$y, Sum=$result")
        return result
    }

    @Test
    fun addition_isCorrect() {
        assertEquals(14, addNumbers(9, 5))

    }

    @Test
    fun addition_isIncorrect() {
        assertNotEquals(4, addNumbers(9, 5))

    }
}