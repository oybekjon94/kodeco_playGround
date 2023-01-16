package lambdas

fun main(){
    //--------------
    var prices = arrayOf(1.50,10.00,4.99,2.30,8.19)
    //--------------

    //for each -> loops over a collection and performs an operation

    //for each as  a for loop
    for (price in prices){
        println(price)
    }

//    prices.forEach { price ->
//        println(price)
//    }

    prices.forEach {
        println(it)
    }

    prices.forEach (::println)
    // same results
    //-------------------

    //map -> loops over an collection ,executes lambda code ,returns a new collection

    //map as a for loop
//    var salePrices:MutableList<Double> = mutableListOf<Double>()
//    for (price in prices){
//        salePrices.add(price * 0.9)
//    }
    //we use the lambda
    val salePrices = prices.map { prices -> prices * 0.9 }
    //val salePrices = prices.map { it * 0.9 }
    // same results
    println(salePrices)


    //mapNotNull
    //---------------
    val userInput : List<String> = listOf("meow","15","37.5","seven","42")
    //----------
    val numbers =  userInput.map { it.toIntOrNull() }
    println(numbers)

    val validInput = userInput.mapNotNull { it.toIntOrNull() }
    println(validInput)
}
