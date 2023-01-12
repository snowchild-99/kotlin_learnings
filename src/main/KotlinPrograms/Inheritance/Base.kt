package Inheritance

open class Base{
    lateinit var baseVariable : String
//internal means that it'll be available in the same module only
    internal fun displayBase(){
    println("Base Class")
    }
}