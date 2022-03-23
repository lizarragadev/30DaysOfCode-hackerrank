import java.io.PrintWriter

/**
 * Tutorials > 30 Days of Code > Day 3: Intro to Conditional Statements
 *
 * https://www.hackerrank.com/challenges/30-conditional-statements/
 * @author lizarragadev
 *
 */

fun main(args: Array<String>) {
    _writer.day03()
    _writer.flush()
}

fun PrintWriter.day03() {
    val n = readInt()
    if (n in 1..100)
        if (n.rem(2) == 0)
            when (n) {
                in 2..5 -> kotlin.io.print("Not Weird")
                in 6..20 -> kotlin.io.print("Weird")
                else -> kotlin.io.print("Not Weird")
            }
        else
            kotlin.io.print("Weird")
}