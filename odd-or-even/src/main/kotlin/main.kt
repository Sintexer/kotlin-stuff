fun main(args: Array<String>) {
    var input = "";
    val invitation = "Type a number or \"q\" to exit";
    do {
        println(invitation)
        input = readLine()!!
        input.toIntOrNull()?.also {
            println("This number is ${if(isOdd(it)) "odd" else "even"}") }
    }while (input != "q")
}

fun isOdd(num: Int): Boolean {
    return num % 2 !=0
}
