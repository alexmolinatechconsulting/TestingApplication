package com.example.testingapplication

import java.util.Scanner

fun checkIfEvenOrOdd() {

    val reader = Scanner(System.`in`)

    print("Enter a number: ")
    val num = reader.nextInt()

    if (num % 2 == 0)
        println("$num is even")
    else
        println("$num is odd")
}