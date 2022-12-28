package `collection&lambdas`

fun main(){
    val countries = listOf("Bein","Burkina","Uzbeistan","Korea")
    val mutableList = countries.toMutableList()

    mutableList.add("Russia")
    mutableList.add(1,"America")

    println(countries)
    println(mutableList)

    mutableList.addAll(listOf("japan","China","Indonezia"))
    println(mutableList)

    val isWestAfricanCountry  = "Tanzania" in mutableList
    println(isWestAfricanCountry)

    mutableList.remove("japan")
    mutableList.removeAt(0)
    mutableList.removeAll(listOf("China","Indonezia"))
    println(mutableList)

    mutableList[2] = "Guinea"
    val combinedList = countries + mutableList
    val emptyList = emptyList<String>()

    println(mutableList)
    println(combinedList)
    println(emptyList)

    mutableList.clear()
    println(mutableList)
}