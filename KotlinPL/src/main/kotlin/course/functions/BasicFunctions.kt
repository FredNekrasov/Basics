package course.functions

/**
 *  Unit-returning functions.
 *  If a function does not return a useful value, its return type is Unit.
 *  Unit is a type with only one value - Unit.
 *  The Unit return type declaration is also optional.
 */
fun unitReturningFunction(a: Int, b: Int) = println("sum of $a and $b is ${a + b}")
/**
 *  Functions with default values
 *  If a function has default values for its parameters, you can omit them when calling the function.
 */
fun functionWithDefaultValue(a: Int, b: Int = 10) = println("product of $a and $b is ${a * b}")
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
// we learned how to write unit-returning functions, functions with default values, single-expression functions, and vararg functions.
fun main() {
    unitReturningFunction(10, 20)
    functionWithDefaultValue(10, 20)
    println(singleExpressionFunction(10, 20))
    varargFunction(1, 2, 3, 4, 5)
}