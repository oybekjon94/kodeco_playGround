package manageControlFlow

fun main(){
    val age = 23

    when(age){
        in 0..12 -> println("still a young human")
        in 13..19 -> println("teenager")
        in 20..29 -> println("in your twenties")
        in 30..39 -> println("in your thirties")
        in 40..50 -> println("in your forties")
        else -> println("you are a wise person")
    }
}