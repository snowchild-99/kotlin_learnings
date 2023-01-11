package ConstantsInKotlin


//User usually defined as UpperCase Letter

class User (var firstName : String, var lastName: String ) {

    fun fullName() : String {
        return "$firstName & $lastName"
    }
        //this is for class level constant
    companion object {
        const val Max_AGE : Int =18
    }


}