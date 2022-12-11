package manageControlFlow

/*
A when expression is a simplified if, but at the same time it’s also
more powerful. If you’ve programmed in any other language, you’re probably
familiar with something called a switch statement. A when is very similar
to a switch.
When statements can have multiple cases, and once any of the cases is met,
 its block of code or expression executes, and then the entire when finishes.
 Each case in when needs to return a Boolean, or needs to be equal to a value.
 In that way it’s similar to an if.
 */

fun main(){
    val age = 23

    when(age){
        23 -> println("close to a quarter century")
        25 -> println("quarter century")
        else -> {
            println("don't know your age")
        }
    }
}