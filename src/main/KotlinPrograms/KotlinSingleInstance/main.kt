package KotlinSingleInstance

fun main () {
    var favouriteFlower = FavouriteFlower()
    favouriteFlower.name ="Lily"
    println(favouriteFlower.name)

   println(FavouriteFood.name)
    FavouriteFood.ingredients.add("Salt")
    println(FavouriteFood.ingredients.first())

    doStuff()
    println(FavouriteFood.name)
    println(FavouriteFood.ingredients.firstOrNull())
    println(FavouriteFood.numberOfIngredients())

}
    fun doStuff() {
        FavouriteFood.name="Chicken"
        FavouriteFood.ingredients.clear()
    }


//Singleton class is a class that is defined in such a way that
// only one instance of the class can be created and used everywhere.
object FavouriteFood {
    var name ="Apple"
    var ingredients = mutableListOf<String>()

    fun numberOfIngredients() : Int {
        return ingredients.size
    }
}


  class FavouriteFlower {
    var name ="Rose"
}