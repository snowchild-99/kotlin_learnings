package KotlinClass.constructorWithInit


//default Constructor
class DemoClass (color : String ="" , flower : String ="") {

    //init block is called after primary constructor is invoked
    init {
        println("Init block is printed")
    }
    init {
        println("another block is printed")
    }

}