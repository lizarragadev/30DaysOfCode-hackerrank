import java.io.PrintWriter

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