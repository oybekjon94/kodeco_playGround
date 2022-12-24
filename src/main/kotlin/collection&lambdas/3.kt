package `collection&lambdas`

/*
Challenge:
Create a PAir  which holds information about a Bank Account

A Bank Account needs to have a Credit card connected to it , and a balance

A Credit card should have a Card number, security code and the type of the
card for Example"Visa" or" "MasterCard"


print out the data for the Account, while hiding the security code
 */
fun main() {
    val creditCard = Triple("475637567463","007","Visa")
    val bankAccount = Pair(16000.0, creditCard)

    val (balance, card) = bankAccount
    val (cardNumber, securityCode, cardType) = creditCard

    println("The account has $balance, with the cardNumber: $cardNumber " +
            "and the cardType: $cardType, security: ***")
}
