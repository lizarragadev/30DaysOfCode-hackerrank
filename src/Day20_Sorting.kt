/**
 * Tutorials > 30 Days of Code > Day 20: Sorting
 *
 * https://www.hackerrank.com/challenges/30-sorting/
 * @author lizarragadev
 *
 */

fun main() {
    val n = readInt()
    val a = readInts(n).toMutableList()

    var numberOfSwaps = 0
    for (i in 0 until n) {
        for (j in i + 1 until n) {
            if (a[i] > a[j]) {
                val temp = a[i]
                a[i] = a[j]
                a[j] = temp
                numberOfSwaps++
            }
        }
    }
    println("Array is sorted in $numberOfSwaps swaps.")
    println("First Element: ${a[0]}")
    println("Last Element: ${a[a.size - 1]}")
}