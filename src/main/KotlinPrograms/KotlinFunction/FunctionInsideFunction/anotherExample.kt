package KotlinFunction.FunctionInsideFunction

fun sayHiBye() {
    println("Hi")
    fun sayBye() {
        println("Bye")
        fun moo() {
            println("moo")
        }
        moo()
    }
    sayBye()
}
fun main() {
    sayHiBye()
}