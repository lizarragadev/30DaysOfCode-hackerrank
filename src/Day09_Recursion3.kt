import java.io.PrintWriter

/**
 * Tutorials > 30 Days of Code > Day 9: Recursion 3
 *
 * https://www.hackerrank.com/challenges/30-recursion/
 * @author lizarragadev
 *
 */

fun main(args: Array<String>) {
    _writer.day09()
    _writer.flush()
}

fun PrintWriter.day09() {
    val n = readInt()
    if(n in 2..12) {
        println(factorial(n))
    }
}

fun factorial(n: Int): Int {
    return if(n == 0) 1
    else n * factorial(n - 1)
}