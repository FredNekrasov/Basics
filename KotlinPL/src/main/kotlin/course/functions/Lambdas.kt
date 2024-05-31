package course.functions

// let's learn how to write lambdas, anonymous functions, and higher-order functions in Kotlin
fun main() {
    //https://kotlinlang.org/docs/lambdas.html#lambda-expressions-and-anonymous-functions
    /**
     *  Lambda expressions and anonymous functions
     *  A lambda expression is an anonymous function that can be assigned to a variable or passed as an argument to another function.
     *  An anonymous function is a function without a name. It is created using the fun keyword.
     *  Lambda expressions can be used to create anonymous functions that can be passed as arguments to other functions.
     *  the value of the last expression is implicitly returned by the lambda expression.
     */
    val difference: (Int, Int) -> Int = { x, y -> x - y }
    val sum = { x: Int, y: Int -> x + y }
    val product = fun(x: Int, y: Int): Int = x * y
    val action: (Boolean) -> Unit = { println(it) }// it: implicit name of a single parameter

    action(true)
    println(difference(10, 20))
    println(sum(10, 20))
    println(product(10, 20))

    println(higherOrderFunction(10, 20, difference))
    println(higherOrderFunction(10, 20, sum))
    println(higherOrderFunction(10, 20, product))
    higherOrderFunction(10, 2) { x, y -> x / y }// if the last parameter is a function, it can be taken out of brackets
}
/**
 *  Higher-order function
 *  A higher-order function is a function that takes another function as an argument or returns a function.
 */
fun higherOrderFunction(
    a: Int,
    b: Int,
    operation: (Int, Int) -> Int//Function types. These types have a special notation that corresponds to the signatures of the functions - their parameters and return values
): Int = operation(a, b)