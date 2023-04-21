fun main() {
    println("Would you like to roll the dice? Click enter to roll!")
    val waitval = readln()
    val randomNum = (1..6).random()
    println(randomNum)
}
