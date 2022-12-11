package manageControlFlow

/*
loops-> mechanism which allows you to run the same piece of code
multiple times
exit/break condition
there are three loops in kotlin
while, do-while loop, for loop
 */
fun main(){
    var counter = 1
    while (counter < 10){
        println(counter) //result-> 1~9
        counter += 1
    }
    //println(counter) //result-> 10
    println("counting up again")
    counter = 1
    do {
        println(counter) //1~9
        counter += 1
    }while (counter < 10)

}
