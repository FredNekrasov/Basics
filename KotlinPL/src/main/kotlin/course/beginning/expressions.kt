package course.beginning

// let's learn how to use expressions in Kotlin
fun main() {
    // The following line reads a line of input from the user and converts it to an integer.
    // If the conversion fails, it returns null. The elvis operator ( ?: ) is used to provide a default value of 0 in case of null.
    // https://kotlinlang.org/docs/null-safety.html#elvis-operator for more information
    val value = readlnOrNull()?.toIntOrNull() ?: 0// ?: - elvis operator. If the right value is null, return the left value
    // Check if the value is equal to 1.
    // If it is, assign the string "one" to the variable result.
    // Otherwise, assign the string "other" to the variable result.
    val result = if (value == 1) "one" else "other"//https://kotlinlang.org/docs/control-flow.html#if-expression
    println(result)
    // Use a when expression to determine the type of the value.
    // If the value is null, assign the string "null" to the variable result2.
    // If the value is a string, assign the string "string" to the variable result2.
    // Otherwise, assign the string "other" to the variable result2.
    val result2 = when(val any: Any? = readlnOrNull()) {//https://kotlinlang.org/docs/control-flow.html#when-expression
        null -> "null"// https://kotlinlang.org/docs/null-safety.html#checking-for-null-in-conditions
        /**
         *  In most cases, you don't need to use explicit cast operators because the compiler automatically casts objects for you.
         *  This is called smart-casting.
         *  The compiler tracks the type checks and explicit casts for immutable values and inserts implicit (safe) casts automatically when necessary
         *  https://kotlinlang.org/docs/typecasts.html for more information
         */
        is String -> any.uppercase()
        else -> "other"
    }
    /* the alternative way to use the expression when
    val result2 = when {
        any is String -> "string"
        any == null -> "null"
        else -> "other"
    }
    */
    println(result2)
    // The `result3` variable is declared and assigned the value of the expression inside the `try` block.
    // The expression inside the `try` block is `readln()`, which reads a line of input from the user.
    // If an exception is thrown during the execution of `readln()`, the `catch` block is executed.
    // The `catch` block catches any `Exception` that is thrown and assigns the localized message of the exception to `result`.
    // If no exception is thrown, `result` will be the line of input that was read.
    val result3 = try {//https://kotlinlang.org/docs/exceptions.html#try-is-an-expression
        readln()
    } catch(ex: Exception) {
        ex.localizedMessage
    }
    println(result3)
}