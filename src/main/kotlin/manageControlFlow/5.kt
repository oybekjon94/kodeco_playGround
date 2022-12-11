package manageControlFlow

/*
exiting early-> But sometimes you need to stop iterating based
on some conditions. Or you need to skip certain elements from
processing. This is called exiting early, and there are two ways
to achieve such behavior.
Using continue and break statements. With continue, you can
stop the current iteration of a loop, and move onto the next one.
Using break, you can break out of a loop entirely, and stop all
 the future iterations. You’ll see how to do so in a minute.

Nested loops are just loops within loops, when you need two layers or levels of processing.
If you’re working with nested loops, when exiting from the loop early you need to specify which of the nested
loops you want to exit from. This can be achieved by using labels. Labels are like checkpoints in code,
which you can travel back to when needed.
 */


fun main(){
    for (num in 0..14){
        if (num%2 == 0){
            continue
        }

        println(num)// result-> odd numbers 1~3~14
        if (num == 7){
           println("get some rest")//result-> 1~7
            break
        }
    }

}