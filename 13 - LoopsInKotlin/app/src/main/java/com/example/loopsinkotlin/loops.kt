package com.example.loopsinkotlin

fun main() {
    // for loops
//    for(i in 1..20){
//        println("$i Hello Everyone!")
//    }

//    for(i in 1 until 10){
//        println("Hello number $i")
//    }

//    println(1 until 10)

//    for(i in 1 until 10 step 3){
//        println("Hello #$i")
//    }

//    for(i in 10 downTo 1){
//        println("Hello #$i")
//    }

//    for(i in 5 downTo -5){
//        println("Hello #$i")
//    }

//    for(i in 5 downTo -5 step 2){
//        println("Hello #$i")
//    }

    // While loops
//    while (true){
//        println("Infinite loooooop....")
//    }

//    var i = 1
//    while(i <= 5){
//        println("Hello #$i")
//        i++
//    }

//    do {
//        println("do-while Hello $i")
//        i++
//    } while (i < 5)

    // break and continue
//    for(i in 1..100){
//        if(i % 11 == 0){
//            println("$i is divisible by 11")
//            break
//        }
//        println("$i is not divisible by 11")
//    }

    for(i in 1..30){
        if(i % 13 == 0){
            println("$i is divisible by 13")
            continue
        }
        println("$i is not divisible by 13")
    }
}