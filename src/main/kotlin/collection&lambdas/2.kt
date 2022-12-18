package `collection&lambdas`

fun main() {
    val birthday = Triple(2,3,1991)
    val person = Pair("Damini",birthday)
    val nameUsingOrdering = person.first
    val birthdayUsingOrdering = person.second
    val (name,bday) = person
    val (dayOfBirth, birthMonth, _) = bday
    val yearOfBirth = birthdayUsingOrdering.third

    println("$name was born on $dayOfBirth/$birthMonth, year unknown!")
}