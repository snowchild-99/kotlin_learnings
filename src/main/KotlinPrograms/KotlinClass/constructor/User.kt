package KotlinClass.constructor


//in kotlin the secondary constructor always initialize the primary constructor
//The code inside the init block is the first to be executed when the class is instantiated

//primary constructor
class User (firstName : String, lastName : String) {

    constructor(firstName: String ,lastName: String, isAlive: Boolean) : this(firstName,lastName){
        println("constructor $firstName, $lastName,$isAlive")
    }

    init {
        println("Primary constructor initialized")
        println("$firstName,$lastName")
    }
}
