package KotlinClass.constructor2

//Primary Constructors in Kotlin are defined in the class header itself as shown below.
class Employee (firstName: String, lastName: String, isPlatinum: Boolean)  {

    //assume we know employee is not platinum

    //secondary Constructor
    constructor(firstName: String , lastName: String) : this(firstName, lastName,false) {
        println("IsPlatinum is False by Default")
    }

    //third Constructor
    constructor(firstName: String): this(firstName, "unknown") {
        println("Third constructor")

    }

}