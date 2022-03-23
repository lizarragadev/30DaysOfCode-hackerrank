
/**
 * Tutorials > 30 Days of Code > Day 26: Nested Logic
 *
 * https://www.hackerrank.com/challenges/30-nested-logic/
 * @author lizarragadev
 *
 */

fun calculateMulta(acDay: Int, acMonth: Int, acYear: Int, enDay: Int, enMonth: Int, enYear: Int): Int {
    var totalMult = 0
    if(acYear > enYear) totalMult = 10000
    else if (acYear == enYear)
        if(acMonth > enMonth) totalMult = (acMonth - enMonth) * 500
        else if (acMonth == enMonth)
            if(acDay > enDay) totalMult = (acDay - enDay) * 15
    return totalMult
}

fun main() {
    print(calculateMulta(readInt(), readInt(), readInt(), readInt(), readInt(), readInt()))
}