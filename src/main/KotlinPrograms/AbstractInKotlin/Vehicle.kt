package AbstractInKotlin

abstract class Vehicle (var color: String, var numberOfWheel :Int, var numberOfDoor :Int){

    abstract fun drive()
    fun openDoor(){
        println("door opened from vehicle")
    }


}
