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