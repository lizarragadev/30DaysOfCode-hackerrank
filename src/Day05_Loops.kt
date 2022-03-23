import java.io.PrintWriter

/**
 * Tutorials > 30 Days of Code > Day 5: Loops
 *
 * https://www.hackerrank.com/challenges/30-loops/
 * @author lizarragadev
 *
 */

fun main(args: Array<String>) {
    _writer.day05()
    _writer.flush()
}

fun PrintWriter.day05() {
    val n = readInt()
    for (i in 1..10) {
        println("$n x $i = ${n*i}")
    }
}