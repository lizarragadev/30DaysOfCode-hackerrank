import java.io.PrintWriter
import kotlin.math.pow

fun main(args: Array<String>) {
    _writer.day10()
    _writer.flush()
}

fun PrintWriter.day10() {
    val n = readIntWithRange(1, (10.toDouble().pow(6)).toInt())
    val binary = Integer.toBinaryString(n).toList()
    var maxOnes = Integer.MIN_VALUE
    var count = 0
    binary.forEach {
        if(it == '1')
            count++
        else
            count = 0
        if(count > maxOnes)
            maxOnes = count
    }
    println(maxOnes)
}