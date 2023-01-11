package CompanionObject.example2

class User(var firstName : String, var lastName : String) {

    companion object {
        val users = mutableListOf<User>()
        fun createUsers(count : Int) : List<User>{
            for (i in 1..count){
               users.add(User("Sandeep$i","Yadav$i"))
            }
            return users
        }
    }
     fun fullName(): String {
        return "$firstName $lastName"
    }
    override fun toString(): String {
        return fullName()
    }


}