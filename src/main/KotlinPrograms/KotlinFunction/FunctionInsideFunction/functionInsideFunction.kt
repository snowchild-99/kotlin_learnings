package KotlinFunction.FunctionInsideFunction

fun add(): Int {
    var a: Int = 5
    var b: Int = 7
    var sum: Int = a.plus(b)

    fun addInsum(): Int {
        return 9
    }

    var finalAdd: Int = addInsum()
    return sum.plus(finalAdd)
}

fun main() {
    var resultAdd: Int = add()
    println(resultAdd)

}