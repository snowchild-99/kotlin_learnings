package KotlinClass.constructorWithInit


//default Constructor
class DemoClass (color : String, flower : String ) {

    //2nd Constructor
    constructor(color : String) : this(color, "")
    {
        println("2nd Constructor is printed")
    }

    //init block is called after primary constructor is invoked
    init {
        println("Init block is printed")
    }
    init {
        println("another block is printed")
    }

}