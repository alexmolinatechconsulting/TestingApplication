package com.example.testingapplication

import org.junit.Assert.assertEquals
import org.junit.Assert.assertThrows
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class problem1UnitTests {

    @Test
    fun index1_isOutOfArrayBounds_throwsException() {
        val collection = listOf(1,2,3,4,5)
        val index1 = 8
        val index2 = 1
        assertThrows(Exception::class.java, {swapTwoNumbers(collection, index1, index2)})
    }

    @Test
    fun index2_isOutOfArrayBounds_throwsException() {
        val collection = listOf(1,2,3,4,5,536,31,4,2)
        val index1 = 4
        val index2 = 43
        assertThrows(Exception::class.java, {swapTwoNumbers(collection, index1, index2)})

    }

    @Test
    fun array_isEmpty_throwsException() {
        val collection = emptyList<Int>()
        val index1 = 3
        val index6 = 433
        assertThrows(Exception::class.java, {swapTwoNumbers(collection, index1, index6)})
    }

    @Test
    fun index1AndIndex2AndList_areInBoundsAndListIsNonempty_swapsValuesAtIndeces() {
        val collection = listOf(1,2,3,4,5,536,31,4,2)
        val index1 = 4
        val index2 = 6
        swapTwoNumbers(collection, index1, index2)
        assertEquals(listOf(1,2,3,4,31,536,5,4,2), collection)
    }
}