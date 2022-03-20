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