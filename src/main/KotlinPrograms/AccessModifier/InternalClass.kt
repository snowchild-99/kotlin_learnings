package AccessModifier

internal class Axel(val numberOfWheel: Int)

open class Vehicle (var color: String){
    private lateinit var axels : MutableList<Axel>
    
    fun info(){
        println("Vehicle color is $color")
    }
    fun addAxel(numberOfWheel: Int){
        axels.add(Axel(numberOfWheel))
    }
}
class Truck(color: String): Vehicle(color){

    init {
        addAxel(5)
        addAxel(7)
    }

}


fun main() {

    var vehicle = Vehicle("Pink")
    vehicle.info()

}