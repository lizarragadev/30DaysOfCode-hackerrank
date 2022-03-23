import java.io.PrintWriter

/**
 * Tutorials > 30 Days of Code > Day 0: Hello World
 *
 * https://www.hackerrank.com/challenges/30-hello-world/
 * @author lizarragadev
 *
*/

fun main(args: Array<String>) {
    _writer.day00()
    _writer.flush()
}

fun PrintWriter.day00() {
    println("Hello, World.")
    println(readLn())
}