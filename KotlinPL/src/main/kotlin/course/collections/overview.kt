package course.collections

// let's learn different ways to create collections
fun main() {// https://kotlinlang.org/docs/collections-overview.html
    // https://kotlinlang.org/docs/constructing-collections.html
    // immutable collections
    val immutableList = listOf(1, 2, 3, 3, 2, 3)
    val immutableSet = setOf(1, 2, 3, 3, 2, 3)
    val immutableMap = mapOf(1 to "one", 2 to "two", 3 to "three")
    println(" list: $immutableList\n set: $immutableSet\n map: $immutableMap \n")
    // empty collections
    val emptyList = emptyList<Int>()
    val emptySet = emptySet<Int>()
    val emptyMap = emptyMap<Int, String>()
    println(" emptyList: $emptyList\n emptySet: $emptySet\n emptyMap: $emptyMap \n")
    // mutable collections
    val mutableList = mutableListOf(1, 2, 3, 3, 2, 3)
    val mutableSet = mutableSetOf(1, 2, 3, 3, 2, 3)
    val mutableMap = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    println(" mutableList: $mutableList\n mutableSet: $mutableSet\n mutableMap: $mutableMap \n")
    mutableList.add(4)
    mutableSet.add(4)
    mutableMap[4] = "four"
    println(" mutableList: $mutableList\n mutableSet: $mutableSet\n mutableMap: $mutableMap \n")
    // collection builder functions
    val buildList = buildList {
        add(1)
        add(2)
        add(3)
    }
    val buildSet = buildSet {
        add(1)
        add(2)
        add(3)
    }
    val buildMap = buildMap {
        put(1, "one")
        put(2, "two")
        put(3, "three")
    }
    println(" buildList: $buildList\n buildSet: $buildSet\n buildMap: $buildMap \n")
    // Initializer functions for List
    val list1 = List(5) { it + 1 }
    val list2 = MutableList(5) { it + 1 }
    println(" list1: $list1\n list2: $list2 \n")
}