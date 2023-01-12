package AccessModifier

//internal defined class, method, variable can only be accessible With in a module
//internal means that it'll be available in the same module only
internal class A{
    internal lateinit var name : String

    fun display(){
        println(name)
    }
}

fun main() {
    var a = A()
    a.name="Abel"
    a.display()


}