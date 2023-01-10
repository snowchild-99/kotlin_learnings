package KotlinClass.ClassWithFunction.FunctionClass


fun main () {
    var functionClass = FunctionClass("Sandeep", "Yadav")
    var fullName : String = functionClass.fullName()

    println(fullName)
    println(functionClass.fullNameLength())

    functionClass.updatePrefixFirstName("Mr")
    println(functionClass.firstName)


}


