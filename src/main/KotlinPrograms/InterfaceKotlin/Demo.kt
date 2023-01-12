package InterfaceKotlin

class Demo : Sample {
    override var name: String ="Sandeep"


    override fun display() {
        println("display method override")
        println(name)
    }

    override fun start() {
        println("start method override")
    }
}