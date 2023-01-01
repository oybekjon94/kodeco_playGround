package lambdas

/*
Challenge:

In this final challenge, you will have a list of app names with associated
ratings they,ve been given.
Note-these are all fictional apps!

Create  the data ma like so:

  val appRatings = mapOf(
    "Calendar Pro" to arrayOf(1,5,5,4,2,1,5,4),
    "The Messenger" to arrayOf(5,4,2,5,4,1,1,2),
    "Socialise" to arrayOf(2,1,2,2,1,2,4,2)
    )

First,
-create a map called 'averageRatings' which will contain a mapping of app
names to average ratings
-use forEach to iterate through the appRatings map,
-then use 'reduce' to calculate teh average rating and store this rating
in the 'averageRatings' map
-Finally use 'filter' and 'map' chained together to get a list of the app
names whose average rating is greater than 3
 */

fun main(){
    val appRatings = mapOf(
        "Calendar Pro" to arrayOf(1,5,5,4,2,1,5,4),
        "The Messenger" to arrayOf(5,4,2,5,4,1,1,2),
        "Socialise" to arrayOf(2,1,2,2,1,2,4,2)
    )

    val averageRatings = mutableMapOf<String, Double>()

    appRatings.forEach{
        val total = it.value.reduce{a, b -> a+b}
        averageRatings[it.key] = total.toDouble() / it.value.size
    }

    println(averageRatings)

    val topApps = averageRatings.filter {
        it.value > 3
    }.map {it.key}

    println(topApps)
}

