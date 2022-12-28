package `collection&lambdas`

fun main(){
    val countries = arrayOf(
        "Uzbekistan","Russia","Korea","China","Japan"
    )

    println(countries)
    println(countries.size)
    println(countries[3])
    println(countries.get(3))

    val sizedArray = Array(10) {""}
    val emptyArray = emptyArray<String>()

    val arrayOfInt = intArrayOf(2,3,4,5,6,7)
    println(arrayOfInt)

    val intArray = IntArray(10)
    println(intArray)

    println(countries.lastIndex)
    println(countries.last())
    println(countries.first())

    val currentCountry = "Mauritius"
    println(currentCountry.contains(currentCountry))

    val isWestAfricanCountry =  currentCountry in countries
    val isNotWestAfricanCountry =  currentCountry !in countries

    println(isWestAfricanCountry)
    println(isNotWestAfricanCountry)
}