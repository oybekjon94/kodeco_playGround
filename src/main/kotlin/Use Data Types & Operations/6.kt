package `Use Data Types & Operations`

/*
Challenge
Data is valid if:

1.properties are not empty
2. username has at least 6 characters
3. password has at least 110 characters
4. the email contains a '@' and a '.'

Hint: use the 'contains()' function on a String to check if a value
is contained in it
Hint: use the 'isEmpty()' function on a String to check if the string is empty
Example: email.isEmpty()

use 'if ' as an expression to assign a respective error message if any of the
cases fail! the print it out

the messages are prepared for you in the project
 */
fun main(){
    val email = "filip@mail.com"
    val password = "password123"
    val username = "filip.babic"

    val message = if (email.isEmpty() || password.isEmpty() || username.isEmpty()){
        "you must fill in your data"
    }else if (username.length < 6) {
        "username needs to be at least 6 characters long"
    }else if (password.length < 10){
        "password nees to be at least 10 characters long"
    }else if (!email.contains("@") || !email.contains(".")){
        "invalid email format"
    }else{
        "succesful registration"
    }
    println(message)
}