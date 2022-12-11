package manageControlFlow

/*
multi-dimensional collections
[0,1,2,3,4]
[5,6,7,8,9]
 */

/*
In this loop, you’re printing out xs. Do note the use
of \t in the string. This is used to add tab spaces between
each item in the column. In the end you’ll get a visual
representation of a 6 by 6 (6x6) matrix.
 */

/*
To add a label to a for loop, do the following:
you’ve now labeled the outer loop. A label is like a checkpoint mark.
You can use it to go back or refer to a location in code.
If you ever want to stop the nested loops, you can break the
row label, and that’s it.
 */
fun main(){
    for (row in 0..5){
        for (column in 0..5){
            print("x\t")
        }
        println()
    }
    println()
    row@for (row in 0..5){
        column@ for (column in 0..5){
            print("x\t")
            if (column == 2 && row == 2){
                break@row
            }
        }
        println()
    }
}