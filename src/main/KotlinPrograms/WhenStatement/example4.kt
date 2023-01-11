package WhenStatement


//We can use multiple branches in a single one separated by a comma.
// When common logic is shared by some branches then we can combine them in a single branch.

fun main() {

    println("Enter A WeekDay")
    var weekDay : String? = readlnOrNull()

    when (weekDay?.lowercase()){
        "monday","tuesday","wednesday","thursday","friday","saturday","sunday"
            -> println(" ${weekDay.lowercase()} is Valid Weekday")
        else -> println("$weekDay is not a Valid WeekDay")
    }
}