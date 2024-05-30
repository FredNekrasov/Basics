package course

// let's learn how to declare basic data types in Kotlin
fun main() {
    // val (value) - immutable variable - cannot be changed in Kotlin.
    val byte: Byte = 1
    val short: Short = 2
    val int: Int = 3 // all integers in Kotlin are Int by default
    val long: Long = 4L
    val float: Float = 5.0f
    val double: Double = 6.0 // all non-integers in Kotlin are double by default
    val char = 'a' // we don't need to specify the type, because it is inferred by the compiler
    val boolean: Boolean = true
    // var (variable) - mutable variable - can be changed in Kotlin.
    var string: String = "Hello World"
    // * nullable variable - variable that can be null in Kotlin. For example:
    val name: String? = null
}