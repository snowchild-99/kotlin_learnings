package KotlinClass.ClassProperties

import ConstantsInKotlin.Constant
import ConstantsInKotlin.User
import KotlinClass.ClassWithFunction.FunctionClass.FunctionClass


fun main() {

    var classWithProperties = classWithProperties("Sandeep","Yadav")
    println(classWithProperties.fullName)

    classWithProperties.fullName ="Sandeep"
    println(classWithProperties.fullName)

}