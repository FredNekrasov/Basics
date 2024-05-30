package course

// let's learn how to declare arrays in Kotlin
@OptIn(ExperimentalUnsignedTypes::class)
fun main() {
    // Creating a basic array of strings
    val array = arrayOf("Hello", "World", "\n", "Kotlin", "Is", "Awesome", "!")
    val emptyArray = emptyArray<String>()// Creating an empty array of strings with a size of 0
    // Creating an array of bytes (signed 8-bit integers)
    val byteArray = byteArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    // Creating an array of shorts (signed 16-bit integers)
    val shortArray = shortArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    // Creating an array of integers (signed 32-bit integers)
    val intArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    // Creating an array of longs (signed 64-bit integers)
    val longArray = longArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    // Creating an array of floats (32-bit IEEE 754 floating point numbers)
    val floatArray = floatArrayOf(1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f, 10.0f)
    // Creating an array of doubles (64-bit IEEE 754 floating point numbers)
    val doubleArray = doubleArrayOf(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0)
    // Creating an array of booleans (true or false values)
    val booleanArray = booleanArrayOf(true, false, true, false, true, false, true, false, true, false)
    // Creating an array of characters (Unicode code points)
    val charArray = charArrayOf('H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!')
    // Creating an array of unsigned bytes (unsigned 8-bit integers)
    val uByteArray = ubyteArrayOf(1u, 2u, 3u, 4u, 5u, 6u, 7u, 8u, 9u, 10u)
    // Creating an array of unsigned shorts (unsigned 16-bit integers)
    val uShortArray = ushortArrayOf(1u, 2u, 3u, 4u, 5u, 6u, 7u, 8u, 9u, 10u)
    // Creating an array of unsigned integers (unsigned 32-bit integers)
    val uIntArray = UIntArray(10) // Creating an array special for unsigned integers with a size of 10
    // Creating an array of unsigned longs (unsigned 64-bit integers)
    val uLongArray = ULongArray(10) { 0u } // Creating an array special for unsigned long integers with a size of 10 and a default value of 0
}