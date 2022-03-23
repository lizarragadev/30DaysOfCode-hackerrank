
/**
 * Tutorials > 30 Days of Code > Day 28: RegEx, Patterns and Intro to Databases
 *
 * https://www.hackerrank.com/challenges/30-regex-patterns/
 * @author lizarragadev
 *
 */

fun main() {
    val N = readInt()
    val list = mutableListOf<String>()
    for (NItr in 1..N) {
        val firstName = read()
        val emailID = read()
        if(emailID.split("@")[1] == "gmail.com") {
            list.add(firstName)
        }
    }
    list.sort()
    list.forEach {
        println(it)
    }
}