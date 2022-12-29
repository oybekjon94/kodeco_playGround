package `collection&lambdas`

/*
Challenge:
create a simple function that:

- takes a list of integers as its argument,
- sums up the elements in the list
- then return the sum
 */

fun main(){
    fun sumOfElements(list: List<Int>): Int {
        var sum  = 0
        for (number in list){
            sum += number
        }
        return sum
    }

    println(sumOfElements(listOf(2,2,8,6,1)))
}