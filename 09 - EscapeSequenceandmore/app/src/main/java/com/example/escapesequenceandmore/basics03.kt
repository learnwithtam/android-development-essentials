package com.example.escapesequenceandmore

fun main(){

    // Escape Sequences
//    println("I am a line\nI am a new line")
//    println("I am a sentence\t\twith a tab")
//    println("U will be replaced with \rI")
//
//    println("I am a string with \"double quotes\"")
//    println("I have a backslash \\ within this string")
//
//    println("My income is \$fifty")

    // All variables are objects
//    val myVariable = "hello everyone!"
//    println(myVariable)
//    println(myVariable.length)
//    println(myVariable.toUpperCase())
//    println(myVariable.toLowerCase())
//    println(myVariable.capitalize())
//    println(myVariable.contains("every"))

    // Type Casting
    val unknown: Any = 10
    val number: Int = unknown as Int
    println(number)

    // Type checking
    println(number is Int)
    println(unknown is String)

}