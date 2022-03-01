import java.io.PrintWriter

fun main(args: Array<String>) {
    _writer.day11()
    _writer.flush()
}

fun PrintWriter.day11() {
    val A = fillA2DArray()
    val lim = (A.size - 2) * (A.size - 2)

    var may = Integer.MIN_VALUE
    var sum: Int
    var extremos: Boolean

    var iniFila = -1
    var iniColum = -1
    var resetFila = 0

    for (p in 0 until lim) {
        extremos = true
        if(p.rem(A.size - 2) == 0) {
            iniFila = resetFila
            resetFila++
            iniColum = 0
        } else {
            iniColum++
        }
        sum = 0
        for (i in iniFila until (iniFila + 3)) {
            if(extremos) {
                for (j in iniColum until (iniColum + 3)) {
                    sum += A[i][j]
                }
                extremos = false
            } else {
                sum += A[i][iniColum + 1]
                extremos = true
            }
        }
        if(sum > may)
            may = sum
    }
    println(may)
}

fun fillA2DArray(): Array<IntArray> {
    val size = 6
    val array = Array(size) {IntArray(size)}
    for (i in 0 until size){
        for (j in 0 until size){
            val element = readInt()
            if(element in -9..9)
                array[i][j] = element
        }
    }
    return array
}