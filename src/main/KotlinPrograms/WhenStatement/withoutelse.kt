package WhenStatement


//without else program simply exits the block without printing anything to system output
fun main() {
    println("Enter Planet Name")
    var planetName : String ? = readlnOrNull()
    when (planetName?.uppercase()) {
        "SUN" -> println("Planet is Sun")
        "MOON" -> println("Planet is Moon")
        "MARS" -> println("Plant is Mars")

    }
    println(planetName?.uppercase())

}