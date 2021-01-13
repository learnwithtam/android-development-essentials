package com.example.lists

fun main() {
    // Collections

    // sentence - Hello and welcome to Learn with TAM
    // list - ["Hello", "and", "welcome", "to", "Learn", "with", "TAM"]

    // prime numbers under 10
    // set - [2, 3, 5, 7]

    // There are three students TAM, SAM, and ZAM, with roll numbers 1, 2, and 3
    // map of students - ["TAM" to 1, "SAM" to 2, "ZAM" to 3]

    // List in Kotlin
    val sentence = "We are here to learn android development"
    val wordsInSentence = listOf("We", "are", "here", "to", "learn", "android", "development")
//    println("Sentence: $sentence\nWords in Sentence: $wordsInSentence")
//
//    val splitList = sentence.split(" ")
//    println(splitList)
//
//    println(splitList == wordsInSentence)

//    val firstWord = wordsInSentence[0]
//    println("The first word is $firstWord")

    // 0-based Indexing
//    println("The 3rd word is on index 2 -> ${wordsInSentence[2]}")
//    println("The 5th word is on index 4 -> ${wordsInSentence[4]}")

//    println("The 4th word is on index 3 -> ${wordsInSentence.get(3)}")

//    println("The 10th element of the list is -> ${wordsInSentence[9]}")

//    val wordListSize = wordsInSentence.size
//    println("The size of the List is: $wordListSize")

//    println("The last word is on index ${wordsInSentence.size - 1} -> ${wordsInSentence[wordsInSentence.size - 1]}")
//
//    println("The last word is on index ${wordsInSentence.lastIndex} -> ${wordsInSentence[wordsInSentence.lastIndex]}")

    // Negative index
//    println("The word on index -1 is -> ${wordsInSentence[-1]}")

    // indexOf Method
//    val indexOfAndroid = wordsInSentence.indexOf("android")
//    println("The index of the word android is: $indexOfAndroid")

//    println("The index of the word TAM is: ${wordsInSentence.indexOf("TAM")}")

    val isFound = wordsInSentence.contains("android")
    println("The list ${if(isFound) "contains" else "doesn't contain"} the word android")

}