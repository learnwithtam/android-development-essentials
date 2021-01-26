package com.example.maps

fun main() {
    val map = mapOf(1 to "TAM", 2 to "SAM", 3 to "ZAM")
    val anotherMap = mapOf("TAM" to 1, "SAM" to 2, "ZAM" to 3)

//    println("map: $map, anotherMap: $anotherMap")

    // Keys and values
//    println("Keys in map: ${map.keys}")
//    println("Values in map: ${map.values}")
//    println("Keys in anotherMap: ${anotherMap.keys}")
//    println("Values in anotherMap: ${anotherMap.values}")

    // Entries
//    println("Entries of map are: ${map.entries}")
//    println("Entries of anotherMap are: ${anotherMap.entries}")


    // Identical Keys
//    val badMap = mapOf(1 to "NAM", 2 to "SAM", 1 to "TAM", 3 to "ZAM", 4 to "PAM", 2 to "RAM")
//    println(badMap)

    // getting values
//    println("value for key 1 in map is ${map.get(1)}")
//    println("value for key 2 in map is ${map[2]}")

//    println("value for key \"TAM\" in anotherMap is ${anotherMap.get("TAM")}")
//    println("value for key \"ZAM\" in anotherMap is ${anotherMap["ZAM"]}")

    // Mutable Maps

//    val mutableMap = mutableMapOf("TAM" to 1, "SAM" to 2, "ZAM" to 3)
//    println(mutableMap)
//
//    mutableMap.put("PAM", 4)
//    println("After putting PAM $mutableMap")
//
//    mutableMap += mapOf("JAM" to 5)
//    println("After adding JAM: $mutableMap")
//
//    mutableMap += mapOf("FAM" to 6, "DAM" to 7)
//    println("After adding FAM and DAM: $mutableMap")
//
//    mutableMap["LAM"] = 4
//    println("After putting LAM as 4: $mutableMap")
//
//    mutableMap["LAM"] = 50
//    println("After modifying LAM to 50 $mutableMap")
//
//    mutableMap.remove("JAM")
//    println("After removing JAM: $mutableMap")


    val iteratingMap = mapOf("TAM" to 1, "SAM" to 2, "ZAM" to 3)

//    for((k, v) in iteratingMap){
//        println("$k : $v")
//    }

//    iteratingMap.forEach{(k, v) ->
//        println("$k : $v")
//    }

    val mapKeySet = iteratingMap.keys
    val mapIterator = mapKeySet.iterator()
    while (mapIterator.hasNext()){
        val nextKey = mapIterator.next()
        val nextValue = iteratingMap[nextKey]
        println("Next key: $nextKey, next value: $nextValue")
    }


}