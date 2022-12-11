package manageControlFlow

/*
challenge:
create a simple countdown from 10 to 11
when the countdown completes write "blast off

the word "blast off" can bbe printed outside the loop
 */
fun main(){
    var counter = 10

    while (counter > 0){
        println(counter)
        counter -= 1
    }
    println("blast off")
}