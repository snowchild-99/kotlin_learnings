package AbstractInKotlin

class User (color: String,numberOfDoor: Int,numberOfWheel: Int): Vehicle(color,numberOfDoor,numberOfWheel)
{
    override fun drive() {
        println("$color & $numberOfDoor $numberOfWheel")
        println("drive function")
    }

}