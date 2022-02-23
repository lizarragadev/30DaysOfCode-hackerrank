import java.io.PrintWriter

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