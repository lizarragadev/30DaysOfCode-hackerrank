import java.io.PrintWriter

/**
 * Tutorials > 30 Days of Code > Day 6: Let's Review
 *
 * https://www.hackerrank.com/challenges/30-review-loop/
 * @author lizarragadev
 *
 */

fun main(args: Array<String>) {
    _writer.day06()
    _writer.flush()
}

fun PrintWriter.day06() {
    val t = readInt()
    if(t in 1..10) {
        for (i in 1..t) {
            val st = readLn()
            println(convertWord(st))
        }
    }
}

fun convertWord(st: String): String {
    var stOdd = ""
    var stEven = ""
    st.forEachIndexed { index, value ->
        if(index.rem(2) == 1) stOdd+=value
        else stEven+=value
    }
    return "$stEven $stOdd"
}