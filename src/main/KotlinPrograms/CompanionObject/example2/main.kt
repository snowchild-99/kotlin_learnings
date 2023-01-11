package CompanionObject.example2

fun main() {

   val users = User.createUsers(5)
   users.forEach { println(it) }

}