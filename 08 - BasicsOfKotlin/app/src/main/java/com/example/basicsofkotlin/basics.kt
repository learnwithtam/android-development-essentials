package com.example.basicsofkotlin

// Anatomy of a Kotlin Program

fun main(){
    // Do whatever you want
    var age = 32 // Integer
    val weight = 65.5
    val savings = 2.00000000001

    val gender = 'M'
    val profession = "Developer and Instructor"
    val address = """My House Number
        My City
        My State        
    """.trimIndent()
    val isNinja = false
    val isCoder = true

    var unknown = 30

    println(age)
    println(weight)
    println(savings)
    println(profession)
    println(gender)
    println(address)
    println(isNinja)
    println(isCoder)

    println("TAM is $age years old!")
    println("The sum of $age and $weight is ${age + weight}")

}