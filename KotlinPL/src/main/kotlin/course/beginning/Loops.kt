package course.beginning

// let's learn how to use loops in Kotlin
fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    // int ranges
    val range = 1..10// This is an integer range from 1 to 10 inclusive
    val reversedRange = 10 downTo 1// This is an integer range from 10 to 1 inclusive
    val stepRange = 1..10 step 2// This is an integer range from 1 to 10 with a step of 2
    val untilRange = 1 until 10// This is an integer range from 1 to 10 exclusive (10 is not included)
    // char ranges
    val charRange = 'a'..'z'// This is a character range from 'a' to 'z' inclusive
    val charReversedRange = 'z' downTo 'a'// This is a character range from 'z' to 'a' inclusive
    val charStepRange = 'a'..'z' step 2// This is a character range from 'a' to 'z' with a step of 2
    val charUntilRange = 'a' until 'g'// This is a character range from 'a' to 'g' exclusive ('g' is not included)
    // This is a while loop that prints each number in the 'numbers' array
    var index = 0
    while (index < numbers.size) {
        print(numbers[index])
        index++
    }
    println()
    // This is a do-while loop that prints each number in the 'numbers' array
    var i = 0
    do {
        i++
        print(i)
    } while (i < 5)
    println()
    // This is a for loop that iterates over each character in the 'charUntilRange' range
    for (j in numbers.indices) {
        print(numbers[j])
    }
    println()
    // This is a for-each loop that iterates over each index in the 'numbers' array
    for (char in charUntilRange) {
        print(char)
    }
}