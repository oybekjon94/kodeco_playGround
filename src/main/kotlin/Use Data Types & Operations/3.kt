package `Use Data Types & Operations`

/*
Challenge 1:
check and store in a Boolean if a password is secure
for simplicity we can say that a password is secure if it has
at least 10 characters
 */

/*
Challenge 2:
check is two people have the same name length
 */

fun main(){
    val myPassword = "hbsjdbvbvhv"
    val isPasswordSecure = myPassword.length >= 10
    println(isPasswordSecure)

    val buddyName = "Filip"
    val strangerName = "Jane"
    val areSameLength = buddyName.length == strangerName.length
    println(areSameLength)
}