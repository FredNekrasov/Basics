package course.beginning

// let's learn how to read user input and print the result in Kotlin
fun main() {
    // 3 different ways to read user input
    val name = readLine()// it's an old version of readlnOrNull()
    val age = readln()// trows an exception if the user didn't enter anything
    val height = readlnOrNull()// can return null if the user didn't enter anything
    println("Hello, $name!")// print the result to the console with a new line
    print("You are $age years old, and your height is $height")// print the result to the console without a new line
}