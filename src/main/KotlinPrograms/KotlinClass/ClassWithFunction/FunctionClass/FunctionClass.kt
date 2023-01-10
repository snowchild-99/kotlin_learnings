package KotlinClass.ClassWithFunction.FunctionClass

class FunctionClass ( var firstName : String,  var lastName : String)  {
        fun fullName() : String {
        return "$firstName $lastName"
    }

    fun fullNameLength() : Int {
        return fullName().length
    }

    fun updatePrefixFirstName (prefix : String) {
        firstName = "$prefix $firstName"

    }




}