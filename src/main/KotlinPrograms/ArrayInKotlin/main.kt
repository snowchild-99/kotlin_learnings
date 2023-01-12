package ArrayInKotlin

import kotlin.concurrent.fixedRateTimer


//In Kotlin, arrays are not a native data type,
// but a mutable collection of similar items which are represented by the Array class.

fun main() {

    val num  = arrayOf(1,2,3,4) //implicit type declaration
    val num1 = intArrayOf(5,6,7,8,9,0) //explicit type declaration
    var anotherArray = arrayOf<String>("Sandeep","Yadav","Hello","World")
    anotherArray[2] = "Weeknd"

    var firstName =anotherArray[1]
    println("First from array index 1 is $firstName")

    for(stringElement in anotherArray){
        println(stringElement)
    }

    for(element in num){
        println(element)
    }
    for(num1Elements in num1){
        println(num1Elements)
    }

}


