package KotlinClass

class User(var name :String? = "",
           var age: Int = 0) {
    fun displayData(gender : String?) {
        println("$name and $age")
        println("$gender")
    }
}