package InterfaceKotlin.InheritanceUsingInterface

fun main() {
    var grandChild = GrandChild()

    grandChild.childDisplay()
    grandChild.display()

    println(grandChild.childName)
    println(grandChild.name)

}