package manageControlFlow

/*
Challenge 1:
create a range of 20 numbers and iterate over it,
printing out the numbers

Challenge 2:
iterate over the range in challenge 1 again , but print
every third number

Challenge 3:
create a decreasing range og 15 numbers and print every second number
 */

fun main(){
    val range = 11..30

    for (number in range){
        print("$number")
    }
    println("")
    for (number in range step 3){
        print("$number")
    }

    println("")
    val reverseRange = 30 downTo 16

    for (number in reverseRange step 2){
        print("$number")
    }
}