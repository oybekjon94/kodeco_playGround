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
}