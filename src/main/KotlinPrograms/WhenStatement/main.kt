package WhenStatement


//in Kotlin "when" statement is similar to Switch in Java
fun main() {
    var user = User("Mandeep")

    //checks the condition
    when(user.fname) {
        "Sandeep" -> {
            println("Name is correct")
        }
        //same as default in java...if no other condition is matched else will execute
        else ->{
            println("Name is incorrect")
        }


    }

}