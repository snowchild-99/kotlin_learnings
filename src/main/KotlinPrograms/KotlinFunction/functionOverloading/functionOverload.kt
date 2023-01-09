package KotlinFunction.functionOverloading

fun main() {
    printInfo("Sandeep", 23)

    //we change the function argument that replace the default value in function
    printInfo("mandeep", 22,"pink","sunday")
    printInfo("Fandeep", 21)
}

//function with default value
fun printInfo(name: String, age: Int, color : String ="Red", day : String = "Monday") {
    println("My name is $name and My age is : $age ,$color,$day")
}