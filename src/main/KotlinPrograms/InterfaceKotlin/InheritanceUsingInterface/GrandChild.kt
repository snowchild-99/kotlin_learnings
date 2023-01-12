package InterfaceKotlin.InheritanceUsingInterface

class GrandChild : Child {
    override var childName: String ="ChildName"

    override fun childDisplay() {
        println("Child Display function")
    }

    override var name: String ="BaseName"

    override fun display() {

        println("Base Display function")
    }
}