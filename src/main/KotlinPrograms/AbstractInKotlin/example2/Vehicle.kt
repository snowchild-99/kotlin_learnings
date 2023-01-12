package AbstractInKotlin.example2

abstract class Vehicle (var color : String, var numberOfwheel : Int, var numberOfDoor :Int){

    abstract  var name: String
    abstract  fun drive()
    fun info(){
        println("$color $numberOfwheel $numberOfDoor")
    }
}
