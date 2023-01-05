package KotlinFunction.functionWithArgument


//function with arguments and default argument
fun doWork(name : String?= "Manoj" , age : Int? ,isHappy : Boolean?= true, lastName : String? = "Yadav"){
    if (age != null) {
        if(age>18){
            print("Your name is $name")
            println("$lastName")
            println("Your age is $age")
            println("Your are Happy? $isHappy")
        }
    }


}

fun main() {
    doWork("Sandeep",23)
}