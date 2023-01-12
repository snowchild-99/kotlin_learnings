package AccessModifier


//private defined class, method, variable can only be accessible With in the file
private class PrivateClass {
    // int is private
   private var int =0

   fun display(){
       int=45
        println(int)
    }
}
fun main() {

    var privateClass = PrivateClass()
    //here by using instance of privateClass we can only access display method not the int variable
    privateClass.display()

    var a = A()
    a.name="Private Class"
    a.display()

}
