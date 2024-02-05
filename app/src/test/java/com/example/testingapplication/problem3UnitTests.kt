package com.example.testingapplication

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream


class problem3UnitTests {

    private val standardOut = System.out
    private val outputStreamCaptor = ByteArrayOutputStream()

    @Before
    fun setUp() {
        System.setOut(PrintStream(outputStreamCaptor))
    }

    @Test
    fun validPositiveValues_AddTogether_PrintTheSum(){
        val int1 = 5
        val int3 = 8
        addTwoIntegers(int1, int3)
        assertEquals("The sum is: 13\n", outputStreamCaptor.toString())
    }

    @Test
    fun validOppositeSignValues_AddTogether_PrintTheSum(){
        val int1 = 5
        val int3 = -8
        addTwoIntegers(int1, int3)
        assertEquals("The sum is: -3\n", outputStreamCaptor.toString())
    }

    @Test
    fun validNegativeValues_AddTogether_PrintTheSum(){
        val int1 = -5
        val int3 = -8
        addTwoIntegers(int1, int3)
        assertEquals("The sum is: -13\n", outputStreamCaptor.toString())
    }
}