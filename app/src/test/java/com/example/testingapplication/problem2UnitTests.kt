package com.example.testingapplication

import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream


class problem2UnitTests {

    private val standardOut = System.out
    private val outputStreamCaptor = ByteArrayOutputStream()

    @Before
    fun setUp() {
        System.setOut(PrintStream(outputStreamCaptor))
    }

    @Test
    fun reader_ValueProvidedIsNotInt_ThrowsException(){

        val input = "i34"
        System.setIn(ByteArrayInputStream(input.toByteArray()));

        checkIfEvenOrOdd() // does this capture this input

        Assert.assertThrows(Exception::class.java, { checkIfEvenOrOdd()})
    }

    @Test
    fun reader_ValueIsIntAndEven_PrintsNIsEven(){

        val input = "4"
        System.setIn(ByteArrayInputStream(input.toByteArray()));

        checkIfEvenOrOdd()

        assertEquals("Enter a number: 4 iw even", outputStreamCaptor.toString())
    }

    @Test
    fun reader_ValueIsIntAndOdd_PrintsNIsOdd(){

        val input = "5"
        System.setIn(ByteArrayInputStream(input.toByteArray()));

        checkIfEvenOrOdd()

        assertEquals("Enter a number: 5 is odd", outputStreamCaptor.toString())
    }
}