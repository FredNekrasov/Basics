package course.beginning

// let's learn how to use expressions in Kotlin
fun main() {
    // The following line reads a line of input from the user and converts it to an integer.
    // If the conversion fails, it returns null. The elvis operator ( ?: ) is used to provide a default value of 0 in case of null.
    val value = readlnOrNull()?.toIntOrNull() ?: 0// ?: - elvis operator. If the right value is null, return the left value
    // Check if the value is equal to 1.
    // If it is, assign the string "one" to the variable result.
    // Otherwise, assign the string "other" to the variable result.
    val result = if (value == 1) "one" else "other"
    println(result)
    // Read another line of input from the user.
    // The type of the variable is Any?, which means it can hold any value, including null.
    val any: Any? = readlnOrNull()
    // Use a when expression to determine the type of the value.
    // If the value is null, assign the string "null" to the variable result2.
    // If the value is a string, assign the string "string" to the variable result2.
    // Otherwise, assign the string "other" to the variable result2.
    val result2 = when(any) {
        null -> "null"
        is String -> "string"
        else -> "other"
    }
    println(result2)
    // The `result3` variable is declared and assigned the value of the expression inside the `try` block.
    // The expression inside the `try` block is `readln()`, which reads a line of input from the user.
    // If an exception is thrown during the execution of `readln()`, the `catch` block is executed.
    // The `catch` block catches any `Exception` that is thrown and assigns the localized message of the exception to `result`.
    // If no exception is thrown, `result` will be the line of input that was read.
    val result3 = try {
        readln()
    } catch(ex: Exception) {
        ex.localizedMessage
    }
    println(result3)
}