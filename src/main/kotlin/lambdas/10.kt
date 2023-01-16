package lambdas

//conclusion -> lambda grand finale - starter
fun main(){
    /*
    See dwarves below.I want them organized like this:
    -grouped by which names come before or after M in the alpfabet.
    -sorted by name length
    -no dwarves with names less than letters long
    -turn dwarves before M into a map , grouped by the first in their names
     */

    //-----------------
    val lotsOfDwarves: List<List<String>> = listOf(
        listOf("Sleepy","Grumpy","Doc","Bashful","Sneezy"),
        listOf("Thorin","Nori","Bombur")
    )
    //------------------

    val (beforeM: List<String>, mAndAfter: List<String> ) = lotsOfDwarves.flatMap { dwarves: List<String> ->
    dwarves.filter { it.length > 3 }
    }.sortedBy { -it.length }.partition { it < "M" }

    val groupedBeforeM: Map<Char, List<String>> = beforeM.groupBy { it.first() }

    println(groupedBeforeM)
    println(mAndAfter)

}