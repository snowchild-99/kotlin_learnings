package KotlinClass.constructor1


//in kotlin the secondary constructor always initialize the primary constructor
//The code inside the init block is the first to be executed when the class is instantiated

//Default constructor
class User {
   var firstName: String = ""
    var lastName : String = ""

    init {
        println("Default Constructor initialized")
    }
   fun  display( firstName : String ,lastName : String) {
        println("$firstName $lastName")
    }

}
