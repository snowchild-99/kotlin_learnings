package ImmutableList

import KotlinClass.User

//since this is an Immutable list we can not add elements in the list later in program
fun main() {
    val number = listOf(1, 2, 3, 4, 5, 6)
    number.forEach { print(it) }

    val string = listOf("Sandeep", "Yadav", "Fandeep", "Yadav", "jgshj", "bdasjdbsada")
    //get the index of list item
    println(string.lastIndexOf("jgshj"))

    string.forEach { println(it) }

    //list of a user-defined class
    val user = listOf(User("Sandeep"))

    user.forEach { println(it) }

    val name: String? = null
    val stuff = if (name.equals(null)) emptyList() else listOf(name)
    println(stuff)

}