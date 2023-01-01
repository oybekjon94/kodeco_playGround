package lambdas

fun main(){
    var prices = arrayOf(1.50,10.00,4.99,2.30,8.19)

//    for (price in prices)
//        println(price)

//    prices.forEach (::println )

//    var salerPrices = mutableListOf<Double>()
//    for(price in prices){
//        salerPrices.add(price * 0.9)
//    }
//    println(salerPrices)

    val salerPrices = prices.map { it*0.9 }
//    println(salerPrices)

    val largePrices = prices.filter{it > 5.0}
//    println(largePrices)

    val sum = prices.reduce{a,b ->
        a+b
    }
    println(sum)

    val userInput = listOf("mmeow","15","37.5","seven","42")

    val number = userInput.map{
        it.toIntOrNull()
    }
//    println(number)

    val validInput = userInput.mapNotNull {
        it.toIntOrNull()
    }
//    println(validInput)



}