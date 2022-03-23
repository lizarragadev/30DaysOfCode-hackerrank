import java.io.PrintWriter

/**
 * Tutorials > 30 Days of Code > Day 7: Arrays
 *
 * https://www.hackerrank.com/challenges/30-arrays/
 * @author lizarragadev
 *
 */

val a = mutableListOf<Int>()
fun main(args: Array<String>) {
    _writer.day07()
    _writer.flush()
}

fun PrintWriter.day07() {
    val n = readInt()
    fillListD(n)
    for(i in a.indices.reversed()) { print("${a[i]} ") }
}

fun fillListD(n: Int){
    for (i in 1..n) a.add(readInt())
}