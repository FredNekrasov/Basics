package course.functions

/**
 *  Unit-returning functions.
 *  If a function does not return a useful value, its return type is Unit.
 *  Unit is a special type that represents the absence of a value.
 *  The Unit return type declaration is also optional.
 */
fun unitReturningFunction(a: Int, b: Int) = println("sum of $a and $b is ${a + b}")
/**
 *  Functions with default values
 *  If a function has default values for its parameters, you can omit them when calling the function.
 */
fun functionWithDefaultValue(a: Int = 10, b: Int = 10) = println("product of $a and $b is ${a * b}")
/**
 *  Single-expression functions
 *  When the function body consists of a single expression, the curly braces can be omitted and the body specified after an = symbol.
 *  Explicitly declaring the return type is optional when this can be inferred by the compiler
 */
fun singleExpressionFunction(a: Int, b: Int) = a + b
/**
 *  Vararg functions
 *  Function that can take an arbitrary number of arguments are called vararg functions.
 *  The vararg keyword is used to indicate that the function can take an arbitrary number of arguments.
 */
fun varargFunction(vararg numbers: Int) = numbers.forEach(::print)
/**
 *  Infix functions
 *  Function marked with the infix keyword can also be called using the infix notation (omitting the dot and the parentheses for the call). Infix functions must meet the following requirements:
 *  - They must be member functions(function in a class) or extension functions.
 *  - They must have a single parameter.
 *  - The parameter must not accept variable number of arguments and must have no default value.
 */
infix fun String.times(n: Int) {
    for (i in 1..n) println("$i. $this")
}
/**
 *  Tail recursive function is a function that calls itself in the tail position (i.e. the last expression in the function body).
 *  Tail recursive function must be defined using the tailrec keyword.
 */
tailrec fun factorial(n: Int, accumulator: Int = 1): Int {
    if (n == 1) return accumulator
    return factorial(n - 1, n * accumulator)
}
// we learned how to write unit-returning functions, functions with default values, single-expression functions, vararg functions, infix functions, and tail recursive functions.
// https://kotlinlang.org/docs/functions.html
fun main() {
    unitReturningFunction(10, 20)
    functionWithDefaultValue(b = 20)
    println(singleExpressionFunction(10, 20))
    varargFunction(1, 2, 3, 4, 5)
    println()
    "Kotlin is awesome" times 5
    println(factorial(5))
}