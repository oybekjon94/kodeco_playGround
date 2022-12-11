package manageControlFlow

/*
For loop-->For loops, compared to while and do while, are used when you know the number
 of iterations you will have within the loop.
 -fixed number of iterations
 -uses ranges
 ranges-> 0..10

 Random.nextInt() The nextInt function of the Random class we used actually takes
 in two integers and generates random numbers within the given range.
 val targetValue = Random.nextInt(from:1, until: 100);
 */

fun main(){
    val rangeFromZeroToTen = 0..10
    println(rangeFromZeroToTen)//result-> 0..10 it's half open range

    val exclusiveRange = 0 until 10
    println(exclusiveRange)  //result 0..9

    for (index in rangeFromZeroToTen){
        print(index) //result-> 012345678910
    }

    println("")

    for (index in 10 downTo 0){
        print(index)
    }
    println("")//result->109876543210


}