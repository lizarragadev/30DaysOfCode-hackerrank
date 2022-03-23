import java.io.PrintWriter
import java.util.*
import kotlin.math.pow

/**
 * Tutorials > 30 Days of Code > Day 8: Dictionaries and Maps
 *
 * https://www.hackerrank.com/challenges/30-dictionaries-and-maps
 * @author lizarragadev
 *
 */

val map = mutableMapOf<String, String>()

fun main(args: Array<String>) {
    _writer.day08()
    _writer.flush()
}

fun PrintWriter.day08() {
    val n = readInt()
    if(n in 1..10.toDouble().pow(5.toDouble()).toInt()) {
        fillMap08(n)
        val sc = Scanner(System.`in`)

        while(!sc.hasNext()) {
            val query = sc.next()
                if(query in map)
                    println("$query=${map[query]}")
                else
                    println("Not found")
        }
    }
}

fun fillMap08(n: Int){
    for (i in 1..n) {
        val key = read()
        val value = read()
        if(!key.isNullOrEmpty() && value.length == 8) {
            map[key] = value
        }
    }
}