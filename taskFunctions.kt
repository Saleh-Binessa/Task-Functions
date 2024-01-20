package com.example.taskfunctions

fun main() {
    // Test the function with different length and width values
    val length1 = 5
    val width1 = 8
    val perimeter1 = calculatePerimeter(length1, width1)
    println("Rectangle with length $length1 and width $width1 has a perimeter of $perimeter1.")

    val length2 = 10
    val width2 = 15
    val perimeter2 = calculatePerimeter(length2, width2)
    println("Rectangle with length $length2 and width $width2 has a perimeter of $perimeter2.")
}
fun calculatePerimeter(length: Int, width: Int): Int {
    return 2 * (length + width)
}
