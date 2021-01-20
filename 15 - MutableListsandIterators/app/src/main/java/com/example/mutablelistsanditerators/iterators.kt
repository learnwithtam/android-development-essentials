package com.example.mutablelistsanditerators

fun main() {
    val sentence = "We are here to learn android development!"
    val words = sentence.split(" ")

//    println(words)

    var index = words.indexOf("android")
//    words[index] = "Android"

    // Mutable Lists
    val mutableWords = mutableListOf("We", "are", "here", "to", "learn", "android", "development!")
    val anotherWordList = words.toMutableList()

//    println("Mutable Word List: $mutableWords")
//    println("Another word List: $anotherWordList")
//    println("Immutable word List: $words")

//    index = mutableWords.indexOf("android")
//    mutableWords[index] = "Android"
//
//    println("After replacement - $mutableWords")

    // Add & Remove elements
//    mutableWords.removeAt(mutableWords.lastIndex)
//    println("After removing development: $mutableWords")
//    mutableWords.add("training")
//    println("After adding training: $mutableWords")
//
//    mutableWords[mutableWords.lastIndex] = "development!"
//    println("After changing back: $mutableWords")

//    mutableWords += "series"
//    println("After adding series: $mutableWords")
//
//    mutableWords.removeAt(mutableWords.lastIndex)
//    println("Current List: $mutableWords")

    // Using a for loop
//    for (i in 0..words.lastIndex) {
//        println("$i - ${words[i]}")
//    }

//    for (i in words.indices) {
//        println("$i - ${words[i]}")
//    }

//    for(word in words){
//        println(word)
//    }

//    for ((i, word) in words.withIndex()){
//        println("$i - $word")
//    }
//
//    println(words.withIndex().toList())

    // ForEach
//    words.forEach{ word ->
//        println(word)
//    }

    // ForEachIndexed
//    words.forEachIndexed{ i, word ->
//        println("$i - $word")
//    }

    // Iterator
//    val iterator = words.iterator()
//
//    while(iterator.hasNext()) {
//        println(iterator.next())
//    }

    // ListIterator
//    val listIterator = words.listIterator()
//    println("Moving forward!")
//    while (listIterator.hasNext()){
//        println("${listIterator.nextIndex()} - ${listIterator.next()}")
//    }
//
//    if(!listIterator.hasNext()){
//        println("Iterator is at the end of the list")
//    }
//
//    println("Moving backward")
//    while (listIterator.hasPrevious()){
//        println("${listIterator.previousIndex()} - ${listIterator.previous()}")
//    }

    // Mutable Iterators
    val mutableIterator = mutableWords.iterator()
    while (mutableIterator.hasNext()){
        if(mutableIterator.next() == "android"){
            mutableIterator.remove()
        }
    }

    println(mutableWords)

    // Mutable ListIterators
    val mutableListIterator = mutableWords.listIterator()
    while (mutableListIterator.hasNext()){
        if(mutableListIterator.next() == "development!"){
            mutableListIterator.set("android")
            mutableListIterator.add("development!")
        }
    }

    println("Mutable words after moving forward and modifying: $mutableWords")


    while (mutableListIterator.hasPrevious()){
        if(mutableListIterator.previous() == "android"){
            mutableListIterator.set("Android")
        }
    }

    println("Mutable words after moving backward and modifying: $mutableWords")



}