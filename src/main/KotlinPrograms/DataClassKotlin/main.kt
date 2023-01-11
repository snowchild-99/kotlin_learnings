package DataClassKotlin


//major difference between data class and normal class
//data class is made only to hold data. it is same as normal class with additional features
fun main() {
    var person = Person("Sandeep","Yadav",23)

    val copyOfDataClass = person.copy(firstName = "Fandeep", lastName = "Tesfaye")
    println(copyOfDataClass)

    val order = Order(30,person)
    println(order.component1())
    val personData = order.component2()
    println(personData.firstName)

    println("--------")
    //component refer to data inside the class
    //component count increase as the data member in added
    //deconstruct data class
    val firstName : String = person.component1()
    println(firstName)
    val lastName : String = person.component2()
    println(lastName)
    val age  = person.component3()
    println(age)



    //another way to deconstruct data class
    val (fname,lname,mAge) = person
    println(fname)
    println(lname)
    println(mAge)


    //normal class example
    val nonDataClass = NonDataClass("Mandeep","Yadav")
    println(person)
    println(nonDataClass)

}