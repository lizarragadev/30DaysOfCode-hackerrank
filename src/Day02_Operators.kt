import java.io.PrintWriter
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    _writer.day02()
    _writer.flush()
}

fun PrintWriter.day02() {
    val meal_cost = readDouble()
    val tip_percent = readInt()
    val tax_percent = readInt()
    println(solve(meal_cost, tip_percent, tax_percent))
}

fun solve(meal_cost: Double, tip_percent: Int, tax_percent: Int): Int {
    return ((((tip_percent + tax_percent).toDouble() / 100) * meal_cost) + meal_cost).roundToInt()
}
