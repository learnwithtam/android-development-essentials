package com.example.sets

fun main() {
    // Sets in Kotlin
    // 1. Each element within a set must be unique
    // 2. Same applies to null elements, a set can only have one null element
    // 3. Two sets that have the same elements in any order, are considered equal

    // Creating a Set in Kotlin
//    val myMarks = setOf(10, 8, 10, 7, 5, 9, 7, 8, 10)
//    println("MyMarks Set = $myMarks")

//    val nullSet = setOf(1, null, 3, null)
//    println("Null Set = $nullSet")


    val numberList= setOf(1,2,3,4,5,6)
    val numbersMixed= setOf(6,1,4,3,2,5)

//    println("is $numberList == $numbersMixed? ${numberList == numbersMixed}")

    // Methods and Properties
    val sizeOfSet = numberList.size
//    println("The size of set is $sizeOfSet")
//
//    var isFound = numberList.contains(3)
//    println("The number 3 is found in the set? $isFound")
//
//    isFound = numberList.contains(9)
//    println("The number 9 is found in the set? $isFound")

//    println("The index of number 4 is ${numberList.indexOf(4)}")

    // No Indexing operator or Get method
//    numberList[0]
//    numberList.get(0)

//    println("The indices of numberList are: ${numberList.indices}")

    // First and Last Methods
//    println("The first number is ${numberList.first()}")
//    println("The last number is ${numberList.last()}")

    val hashSet = hashSetOf('a', 'e', 'i', 'o', 'u')
    val linkedHashSet = linkedSetOf('a', 'e', 'i', 'o', 'u')

//    println("Hash Set = $hashSet")
//    println("Linked Hash Set = $linkedHashSet")
//
//    println("First element of hashSet is ${hashSet.first()}")
//    println("First element of LinkedHashSet is ${linkedHashSet.first()}")
//
//    println("Last element of hashSet is ${hashSet.last()}")
//    println("Last element of linkedHashSet is ${linkedHashSet.last()}")

    // ElementAt method
//    println(linkedHashSet.elementAt(2))
//    println(hashSet.elementAt(2))

//    println(linkedHashSet.elementAtOrElse(3){"No element Found!"})
//    println(linkedHashSet.elementAtOrNull(4))

    // Union and Intersect functions
//    val numsUnderFive = setOf(1,2,3,4)
//    val evenUnderTen = setOf(2,4,6,8)
//    println(numsUnderFive union evenUnderTen)
//    println(numsUnderFive intersect  evenUnderTen)

    // Mutable Sets
//    val mutableSet = mutableSetOf(1,2,3,4,5)
//    println("Mutable set: $mutableSet")
//    mutableSet.add(6)
//    println("6 added: $mutableSet")
//    mutableSet.remove(2)
//    println("2 removed: $mutableSet")
//
//    println(mutableSet.remove(3))

    // Iterating a Set
    val numberSet = setOf(1,2,3,4,5)

    println("Printed using for loop")
    for (num in numberSet){
        println(num)
    }

    println("Printed using forLoop and using the withIndex method")
    for((i, num) in numberSet.withIndex()){
        println("$i - $num")
    }

    println("Printed using forEach")
    numberSet.forEach{ item ->
        println(item)
    }
    println("Printed using the forEachIndexed")
    numberSet.forEachIndexed{i, num ->
        println("$i - $num")
    }

    println("printed using the iterator")
    val setIterator = numberSet.iterator()
    while (setIterator.hasNext()){
        println(setIterator.next())
    }

    val mutableNumberSet = mutableSetOf(1,2,3,4,5,6,7,8)
    val mutableSetIterator = mutableNumberSet.iterator()

    println("Before removing values < 4: $mutableNumberSet")
    while (mutableSetIterator.hasNext()) {
        if (mutableSetIterator.next() < 4) {
            mutableSetIterator.remove()
        }
    }
    println("After removing values < 4: $mutableNumberSet")


}