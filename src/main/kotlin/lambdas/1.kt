package lambdas

fun main(){
    var counter = 0
    val incrementCounter = {
        counter+=1
    }

    incrementCounter()
    incrementCounter()
    incrementCounter()
    incrementCounter()
    incrementCounter()
    println(counter)

    fun countingLambda(): () -> Int{
        var counter = 0
        val incremenyCounter: () -> Int = {
            counter += 1
            counter
        }
        return incremenyCounter
    }

    val counter1 = countingLambda()
    val counter2 = countingLambda()

    println(counter1()) // > 1
    println(counter1()) // > 2

    println(counter2()) // > 1
    println(counter2()) // > 2
    println(counter2()) // > 3
    println(counter2()) // > 4
}