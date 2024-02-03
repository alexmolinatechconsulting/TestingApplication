package com.example.testingapplication

import java.lang.IllegalArgumentException
import java.util.Collections

fun swapTwoNumbers(arr : List<Int>, index1 : Int, index2 : Int) {

    // a testable replica of swapping two numbers
    if(arr.isEmpty() || index1+1 >= arr.size || index2+1 >= arr.size){
        throw IllegalArgumentException()
    }

    Collections.swap(arr, index1, index2)
}