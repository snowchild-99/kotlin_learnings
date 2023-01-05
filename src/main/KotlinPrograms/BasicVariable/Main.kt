package BasicVariable

class Person (var music :String)

fun another(){
    //we can explicitly specify the type of val or var
    val finalName : String ="sandessep"
    println(finalName)

     //Structural Equality
    var a =5
    var b =5
    println(a === b)

    //Referential Equality
    var musicInFunction = Person("Pop") //different memory allocation
    var anotherMusicInFunction = Person("Pop") //different memory allocation

    //equality check
    println(musicInFunction === anotherMusicInFunction)

    //inequality check
    println(musicInFunction !== anotherMusicInFunction)



}
fun main(args: Array<String>) {
    //var whose value can be change
    another()

    //single Quote char and double Quote String
    var char: Char ='Z'
    println(char)

    //Boolean var
    var isTrue : Boolean =false
    println(isTrue)

    println(isTrue.not())

    var name : String ="Sandeep"

    //line separator of string in kotlin
    var message ="Hi \nmy name is Sandeep \nI am learning Kotlin"
    println(message)
    println(message.length)
    println(message.uppercase())

    println("Hello my name is "+name)

    //String ' concatenation can be converted to a template
    println("Hello My name is $name")

    val finalName ="nnn"
    println(finalName)

    var age  : Int =23
    println(age)
    println(name.isNotEmpty())

    val decimalNum = 563.54
    println(decimalNum)

    //Math operation
    age  = age.minus(1)
    println(age)
    age = age.times(2)
    println(age)

    name  = name.uppercase()
    println(name)
    var length = name.length
    println(length)

    //Conditional statement

    if(name == "SANDEEP"){
        name = "Weekend"
        println(name)

    }


//Nullable check
    var day :String? ="Monday"
    println(day)
    day = null
    println(day)
    day = "Tuesday"
    println(day)

    //Nullable Safety

    var fname : String? ="Sandeep"
    var nameLength  = fname?.length
    println(nameLength?.plus(5))






}