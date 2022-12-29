package `collection&lambdas`

/*
Challenge:
Create an Array of your five favorite movies
Change an element within the Array and  print out the second movie

After that transform the array to a list that can change its contents
and add two more movies you'd  like to watch

then remove a movie you've watched most recently
Finally print out the list of movies you ended up with
 */
fun main(){
    val movies = arrayOf("Inception","John Wick","Taken","Parasite","Avengers")

    movies[2] = "The Lion King"
    println(movies[1])

    val moviesList = movies.toMutableList()
    moviesList.addAll(listOf("Avatar : the way of the water","Nope"))
    moviesList.remove("Taken")
    println(moviesList)

    println("Taken" in moviesList)
}
