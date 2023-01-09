package KotlinFunction.MultipleArgswithvarargs


fun printBookInfo(tile : String, vararg author: String) {
    println(tile)
    author.forEach { println(it) }

}
fun main () {
printBookInfo("Head First Java" ,"o relly","ye Relly","able")

}