import kotlin.io.*

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
