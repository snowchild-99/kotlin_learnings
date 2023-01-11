package KotlinClass.ClassProperties

fun main() {

    var classWithProperties = classWithProperties("Sandeep","Yadav")
    println(classWithProperties.fullName)

    classWithProperties.fullName ="Sandeep"
    println(classWithProperties.fullName)

}