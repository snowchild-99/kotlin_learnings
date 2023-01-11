package OperatorinKotlin

fun main() {
    var name ="Sandeep"

    if(name.contains("S") || (name.contains("s")))
    {
        var newName : String =name.replace("S", "F")
        println(newName)
    }
    else {
        println("S is not found in $name")
    }
}