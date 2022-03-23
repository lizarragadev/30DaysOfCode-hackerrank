import kotlin.io.*

/**
 * Tutorials > 30 Days of Code > Day 29: Bitwise AND
 *
 * https://www.hackerrank.com/challenges/30-bitwise-and/
 * @author lizarragadev
 *
 */

fun bitwiseAnd(N: Int, K: Int): Int {
    var max = 0
    for (i in 1..N) {
        for (j in 1 until i) {
            val bitAdd = i and j
            if( (max < bitAdd) && (bitAdd < K) )  {
                max = bitAdd
            }
        }
    }
    return max
}

fun main() {
    val t = readInt()

    for (tItr in 1..t) {
        val count = readInt()
        val lim = readInt()
        val res = bitwiseAnd(count, lim)
        println(res)
    }
}
