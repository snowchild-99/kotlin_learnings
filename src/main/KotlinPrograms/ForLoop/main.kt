package ForLoop

fun main() {
    for(i in 1..6) {
        for (j in 1..6-i) {
            print("*")
        }
        print("\n")

    }

    //Iterate through range to jump using step-3 :

    for(i in 1..6 step 3){
        println(i)
    }
    //You can not iterate through Range from top to down without using DownTo

    for (i in 5..1) {
        print("$i ")
    }
    println("It prints nothing")

    //
    for (i in 5 downTo 1) {
        print("$i ")
    }
    println("using downTo keyword")


    //Iterate through Range from top to down with using downTo and step 3:

    for (i in 10 downTo 1 step 3) {
        print("$i ")
    }


}