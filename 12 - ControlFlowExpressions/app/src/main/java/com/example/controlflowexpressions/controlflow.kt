package com.example.controlflowexpressions

fun main(){
    val age = 7
    // If Else
    if(age < 18){
        println("You're not an adult because your age is $age.")
    } else{
        println("You're an adult because your age is $age")
    }

    // Chaining Multiple If Else
    if(age < 13){
        println("You're a kid!")
    } else if (age >= 13 && age < 18){
        println("You're a teenager but not an adult!")
    } else if (age == 18 || age == 19 ){
        println("You're a teenager as well as an adult!")
    } else {
        println("You're an adult!")
    }

    // If Else are expressions
    var message = if(age < 18) "You're not an adult!" else "You're an adult"
    println(message)

    // Chaining If Else expressions
    message = if(age < 13) "You're a kid" else if (age >= 13 && age < 18) "You're a teen but not an adult!" else if(age==18 || age == 19) "You're a teen and an adult" else "You're an adult"
    println(message)

    // When expression
    when{
        age < 13 -> println("You're a kid!")
        age >= 13 && age < 18 -> println("You're a teenager")
        age == 18 || age == 19 -> println("You're an adult teenager")
        else -> println("You're an adult!")
    }

    when(age){
        in 0..12 -> println("You're a kid!")
        in 13..17 -> println("You're a teenager")
        in 18..19 -> println("You're an adult teenager")
        else -> println("You're an adult!")
    }

    // When as expression
    val studentClass = 9
    val classInRoman = when(studentClass){
        1 -> "I"
        2 -> "II"
        3 -> "III"
        4 -> "IV"
        5 -> "V"
        6 -> "VI"
        else -> "NA"
    }
    println("Student is in class $studentClass or $classInRoman!")

}