package NestedClassesInKotlin

fun main() {

    var vehicle = Vehicle()
    vehicle.brand ="BMW"

    //to access the Class inside class we will create instance using top level class
    var steeringWheel = vehicle.SteeringWheel()
    steeringWheel.info()

    var transmission = Vehicle.Transmission()
    transmission.display()

}

class Vehicle {
    var brand : String=""

    //if we want to access the member of top class we have to use inner keyword for inside class
   inner class SteeringWheel{
        var name : String ="Wheel"
        fun info() = println("$name & $brand")
    }
    class Transmission {
        var type : String ="Automatic"
        fun display() =  println(type)
    }
}