package course

// let's learn how to declare basic data types in Kotlin
fun main() {
    // val (value) - immutable variable - cannot be changed in Kotlin.
    val byte: Byte = 1
    val short: Short = 2
    var int = 3 // all integers in Kotlin are Int by default
    val long: Long = 4
    val float: Float = 5.0f
    val double: Double = 6.0 // all non-integers in Kotlin are double by default
    int++ // int += 1 // int = int + 1 // int = 3 + 1 // int = 4
    --int // int -= 1 // int = int - 1 // int = 4 - 1 // int = 3
    val char = 'a' // we don't need to specify the type, because it is inferred by the compiler
    val boolean: Boolean = true
    // var (variable) - mutable variable - can be changed in Kotlin.
    var string: String = "Hello World"// basic string
    // * nullable variable - variable that can be null in Kotlin. For example:
    val name: String? = null// nullable string variable
    string = """
        Kotlin is awesome!
        Kotlin is fun!
        Kotlin is easy!
        Kotlin is BEAUTIFUL!
    """.trimIndent()// multi-line string
    // * unsigned variables - variables that can only be positive in Kotlin. For example:
    val uByte: UByte = 1u
    val uShort: UShort = 2u
    val uInt: UInt = 1u
    val uLong: ULong = 2u
}