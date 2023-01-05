package KotlinFunction

fun displayCow(){
    println("Cow")
    displayMoo()
}
fun displayMoo() {
    println("Mooo")
}
fun main (args : Array<String>){
    displayCow()
    displayCow()
    displayCow()
}