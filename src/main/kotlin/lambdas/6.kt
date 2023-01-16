package lambdas

fun main(){
    fun operatOnNumbers(a: Int,b: Int, operation: (Int, Int)->Int):Int{
        return operation(a,b)
    }

    val addLambda:(Int,Int)-> Int = {a:Int, b:Int ->
        a+b
    }

    operatOnNumbers(4,2, operation = {a,b ->
        a+b
    })

    fun addFunction(a:Int, b: Int) = a+b
    operatOnNumbers(4,2, operation = Int::plus)

}