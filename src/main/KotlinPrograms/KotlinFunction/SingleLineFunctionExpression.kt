@file:Suppress("IMPLICIT_CAST_TO_ANY")

package KotlinFunction

fun main() {

    val age =21
    fun doSomething() = if (age<23) println("under 23") else if(age == 23) println("23") else ("more than 23")
        doSomething()

}

