fun main() {
    println("Please enter a number: ")
    val first = readlnOrNull()
    println("Please enter a number")
    val second = readlnOrNull()
    val sum = first!!.toInt() + second!!.toInt()
    println(sum)
}