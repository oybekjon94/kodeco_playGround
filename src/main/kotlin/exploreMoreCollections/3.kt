package exploreMoreCollections

/*
Challenge:

- Create a list of strings, describing items on your table.If items appear
more than once, add them multiple times,like two pens

- Turn that list into a set , and check if the duplicated appear

- Remove an item you don't really need on your dsk, e.g. car keys

- Iterate over the items ,and print them out
 */
fun main(){
    val items = listOf("Notebook","Pen","Bootle Water","Phone","Bottle Water",
    "Microphone","Masking Tape")
    val uniqueItems = items.toMutableSet()
    println(uniqueItems)

    println(uniqueItems.remove("Phone"))
    println(uniqueItems.remove("Masking Tape"))

    for(item in uniqueItems){
        println(item)
    }
}