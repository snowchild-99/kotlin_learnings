package AbstractInKotlin.example2

abstract  class TwoDoor(color: String,numberOfwheel: Int,numberOfDoor: Int) : Vehicle(color,numberOfwheel,numberOfDoor){
    abstract fun driveFast()
}
