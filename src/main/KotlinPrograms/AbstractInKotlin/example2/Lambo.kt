package AbstractInKotlin.example2

class Lambo(): TwoDoor("red",4,4) {
    override fun driveFast() {
    println("Drive Fast")

    }
    override fun drive() {
        println("Drive")

    }

}