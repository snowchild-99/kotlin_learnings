package KotlinLateInt

class LateIntClass {

    //we have to initialize the value of name because it is declared as var
    var name  : String = ""

    //using lateinit we do not  have to  initialize value of lastName instantly...we can do that later in program
    lateinit var lastName : String

    fun display() {
        println("$name & $lastName")
    }

}