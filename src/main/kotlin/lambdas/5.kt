package lambdas

fun main(){
    fun printRange(){
       for(number in 1..5) print ("$number \t")
       println()
    }

    printRange()

    fun printRange(range: IntRange){
        for(number in range) print ("$number \t")
        println()
    }

    printRange(6..10)

    fun creatRange(start: Int, end: Int, isHalfOpen: Boolean): IntRange{
        return if (isHalfOpen){
            start until end
        }else{
            start..end
        }
    }
    val halfOpenRange=creatRange(11,15,true)
    printRange(halfOpenRange)

    val namedArguments = creatRange(isHalfOpen = true, start = 100, end = 115)
    printRange(namedArguments)

    printRange(creatRange(100,101,false))

    fun createCharRange(start: Char, end: Char, isHalfOpen: Boolean = false)  =
        if (isHalfOpen) start until end else start..end

    fun printRange(range: CharRange){
        for (char in range) print ("$char \t")
        println()
    }

    val closedRange = createCharRange('A','G')
    printRange(closedRange)
}