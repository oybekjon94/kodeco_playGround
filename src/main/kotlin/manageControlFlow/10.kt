package manageControlFlow

/*
Challenge :
use a when expression to return a "String" that tells which century an arbitrary year is from
cover at least the last three centuries and return "this was long ago"for others
then print out the returned value
hint: use ranges for year comparison
 */
fun main(){
    val year = 1984

    val message = when(year){
        in 2000..2022->"21st century"
        in 1900..1999->"20st century"
        in 1800..1899->"19st century"
        else->"this was long ago"
    }
    println(message)
}