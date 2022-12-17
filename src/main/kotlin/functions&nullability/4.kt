package `functions&nullability`

fun main(){
    fun createRange(start: Int, end: Int,isHalfOpen: Boolean = false):IntRange = if (isHalfOpen){
        start until end
    }else{
        start..end
    }

    fun createRange(start: Char, end: Char,isHalfOpen: Boolean = false)= if (isHalfOpen){
        start until end
    }else{
        start..end
    }

    fun printRange(range: IntRange){
        for (number in range) print("$number \t")
        println()
    }
    fun printRange(range: CharRange){
        for (characters in range) print("$characters \t")
        println()
    }

    val closeRange = createRange(1, 10)
    printRange(closeRange)

    val halfOpenRange = createRange(5,10,true)
    println(halfOpenRange)

    val charRange = createRange('A', 'Z')
    printRange(charRange)
}