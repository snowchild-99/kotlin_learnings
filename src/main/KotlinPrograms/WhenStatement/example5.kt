package WhenStatement

fun main() {
  println("Enter month of the year")
    var month : Int = readln().toInt()
    when (month) {
        in 1..3 -> println("Spring Season")
        in 4..6 -> println("Summer Season")
        in 7..9 -> println("Rainy Season")
        in 10..12 -> println("Autumn Season")
        !in 1..12 -> println("Enter valid month")

    }
    println(month)
}