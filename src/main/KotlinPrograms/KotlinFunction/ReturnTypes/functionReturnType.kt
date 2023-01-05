package KotlinFunction.ReturnTypes

//Unit kind of equal to Java void return type
fun returnTypeUnit() : Unit {
    println("Unit Return Type function")
}

fun stringReturnType() : String {
    return "Sandeep"
}

fun intReturnType() : Int {
    return 23
}

fun main (args : Array<String>) {
    returnTypeUnit()
    var name : String = stringReturnType()
    println(name)
    var age: Int = intReturnType()
    println(age)

}

