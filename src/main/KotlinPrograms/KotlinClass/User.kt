package KotlinClass

class User( name :String,
            age: Int ) {

    init {
        println("Inside Init block")
    }
    var bio ="$name $age"

}