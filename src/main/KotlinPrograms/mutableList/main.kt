package mutableList

import KotlinClass.User

fun main() {

    var items = mutableListOf("S", "A", "N", "D", "E", "E", "P")
    for (number in items) {
        println(number)
    }
    items.add(7, "Y")
    for (number in items) {
        println(number)
    }
    println("================")
    //remove
    items.removeAt(3)
    for (number in items) {
        print(number)
    }
    println("================")

    val n1= User("Weeknd")
    val n2 = User("Tesfaye")
    val userList = mutableListOf(
        n1,
        n2,
        User("Sandeep"),
        User("Mandeep"),
        User("Fandeep")
    )

    for (i in userList) {
        print("$i ")
    }
    println("================")
    val n3= User("Another")
    userList.add(2,n3)

    for (i in userList) {
        print("$i ")
    }
}
