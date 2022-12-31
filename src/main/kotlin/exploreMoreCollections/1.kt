package exploreMoreCollections

fun main(){
    val moviesColection = mutableMapOf<String, MutableList<String>>()
    println(moviesColection)

    moviesColection["Action"] = mutableListOf("Taken","John Wick")
    println(moviesColection)

    val actionMovies = moviesColection["Action"]
    println(actionMovies)

    val horrorMovies = moviesColection["Horror"]
    println(horrorMovies)

    val authenticationHeaders = mapOf(
        "API_KEY"  to "your-api-key",
        "Authorizattion" to "auth token",
        "content/type" to "application/json"
    )
    println(authenticationHeaders)

    //----Maps

    moviesColection["Horror"] = mutableListOf()
    println(moviesColection)

    moviesColection["Horror"] = mutableListOf("Get out")
    println(moviesColection)

    moviesColection["Horror"]?.add("Middsommar")
    println(moviesColection)

    val removeActionMovies = moviesColection.remove("Action")
    println(removeActionMovies)
    println(moviesColection)

//    authenticationHeaders["Authorization"]  = "new-api-key"
    moviesColection["Horror"]?.add("It Comes At Night")
    moviesColection["Comedy"] = mutableListOf("ted")

    for (key in moviesColection.keys){
        println(key)
    }

    for (value in moviesColection.values){
        println(value)
    }

    for ((key, value) in moviesColection){
        println("Movies in the $key genre you own are: $value")
    }
}