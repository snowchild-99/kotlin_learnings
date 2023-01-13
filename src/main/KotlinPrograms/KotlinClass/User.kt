package KotlinClass

class User( var name :String) {

    init {
        println("Init block $name")
    }

   override fun toString(): String{
       return name
   }
}