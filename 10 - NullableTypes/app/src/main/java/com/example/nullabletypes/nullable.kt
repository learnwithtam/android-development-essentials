package com.example.nullabletypes

fun main(){
    // Nullable types
//    val myString: String? = "TAM"
//    val number: Int? = null
//
//    if(myString != null){
//        val newString: String = myString
//        println(newString)
//    }
//
////    if(myString != null){
////        val result = myString.length
////    }
//
//    // Safe call operator
//    val result = myString?.length
//    val lowerString = myString?.toLowerCase()
//
//    println(result)
//    println(lowerString)

    // Not null assertion operator
//    val count: Int? = 10
//    val incrementedCount: Int = count!!.inc()
//
//    println(incrementedCount)
//
//    val username: String? = "TAM"
//    if(username != null){
//        val displayName: String = username
//    } else{
//        val displayName: String = "Guest"
//    }

    // The Elvis operator "?:"
//    val username: String? = "Some user"
//    val displayName = username ?: "Guest"
//
//    println(displayName)

    // The Let function
    fun incrementer(number: Int): Int{
        return number.inc()
    }

    var count: Int? = 100
//
//    if(count != null) {
//        var newCount = incrementer(count)
//    }

    count?.let {
        var newCount = incrementer(it)

        println(newCount)
    }

}