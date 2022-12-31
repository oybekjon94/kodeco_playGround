package exploreMoreCollections

/* Challenge
Create a map where each key is the name of a pet you have or had, and the
value is the animal type pet is.

E.g. Key "Max", value: "German Shepard Dog".

Add the values to the map , then remove a value

Finally iterate over the map printing out the entries
 */

fun main(){
//    val pets  = mutableListOf<String, String>()
//
//    pets["Ozma"] = "Domestic Medium Hair Cat"
//    pets["Zuri"] = "Black Hamster"
//    pets["Miqos"] = "Golden Retviever Dog"
//
//    pets.remove("Ozma")

    val pets = mapOf("Ozma" to "Domestic Medium Hair Cat",
    "Zuri" to "Black Hamster","Miqos" to "Golden Retviever Dog")

    for ((name, breed) in pets){
        println("The pets $name is a $breed")
    }


}