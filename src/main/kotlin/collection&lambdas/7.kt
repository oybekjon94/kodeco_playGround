package `collection&lambdas`

fun main(){
    val visitedCountries = arrayOf(
        "Russia","USA","poland","the neetherland","romania",
        "greece","germany","spain","portugal","serbia","austria"
    )
    val players = mutableListOf("Alice","bob","cindy","dan")

//    for (countryIndex in 0..visitedCountries.size -1){
//        print("${visitedCountries[countryIndex]} ")
//    }
    for (country in visitedCountries){
        print("$country ")
    }

    println("")
//    for (player in players){
//        print("$player ")
//    }

    for ((index, player) in players.withIndex()){
        println("${index + 1}. $player")
    }
}