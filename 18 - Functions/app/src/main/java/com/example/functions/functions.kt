package com.example.functions

import kotlin.random.Random

fun main() {
    //     Functions in kotlin
    println("This is some text!")

    //     Creating a function in Kotlin
    fun printRandom(){
        val random = Random.nextInt(from = 0, until = 100)
        println("The random number is $random")
    }

    printRandom()
    printRandom()
    printRandom()
    printRandom()
    printRandom()

    // Parameters of a function
    fun betterPrintRandom(min: Int, max: Int){
        val random = Random.nextInt(from = min, until = max)
        println("The random number is $random")
    }

    betterPrintRandom(10, 100)
    betterPrintRandom(100, 1000)

    // Named arguments
    betterPrintRandom(max=1000, min=100)

    // Default values
    fun bestPrintRandom(min: Int = 0, max: Int = 100){
        val random = Random.nextInt(from = min, until = max)
        println("The random number is $random")
    }

    bestPrintRandom()

    bestPrintRandom(min=90)
    bestPrintRandom(max=10)

    bestPrintRandom(min=140, max=160)

    // Return type
    fun sayHello(name: String = "Guest") : Unit {
        println("Hello $name")
    }

    sayHello("TAM")

    fun getHello(name: String = "Guest") : String {
        return "Hello $name"
    }

    val greeting = getHello("Everyone")
    println(greeting)

    fun multiply(x: Int, y: Int) : Int {
        return x*y
    }

    val product = multiply(x=10, y=5)
    println("10 * 5 = $product")

    fun makeDouble(number: Int) = number * 2

    val doubleOfFour = makeDouble(4)
    println("Double of 4 is $doubleOfFour")

    fun calculateSum(vararg numbers: Int) : Int{
        var result = 0
        numbers.forEach {
            result += it
        }

        return result
    }

    val sum = calculateSum(1,2,3,4,5)
    println("The sum of 1 to 5 is $sum")


    println("The sum of no numbers is ${calculateSum()}")


}