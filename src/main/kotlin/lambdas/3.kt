package lambdas

/*
See Dwarves below.
I want them organized like this:

- Grouped by which name come before or after M in the alphabet
- Sorted by name length
- No dwarves with names less than four letters long
- Turn dwarves before M into a map ,grouped by the first letters in their names

 */
fun main(){
    val lotsOfDwarves = listOf(
        listOf("Sleepy","Grumpy","Doc","Bashful","Sneezy"),
        listOf("Thorin","Nori","Bombur")
    )

    val (beforeM, mAndAfter) = lotsOfDwarves.flatMap { dwarfs ->
        dwarfs.filter{it.length > 3}
    }.sortedBy { -it.length }.partition { it < "M" }

    val groupBeforeM = beforeM.groupBy { it.first() }

    println(groupBeforeM)
    println(mAndAfter)
}