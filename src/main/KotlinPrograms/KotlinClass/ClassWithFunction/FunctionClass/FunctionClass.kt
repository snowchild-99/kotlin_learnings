package KotlinClass.ClassWithFunction.FunctionClass

class FunctionClass (private var firstName : String, private var lastName : String)  {
        fun fullName() : String {
        return "$firstName $lastName"
    }

    fun fullNameLength() : Int {
        return fullName().length
    }




}