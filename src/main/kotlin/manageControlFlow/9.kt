package manageControlFlow

fun main(){
    val email = "oybek@mail.com"
    val password = "iLoveKotlin"

    when{
        email.isEmpty()->{
            println("you need to choose an email")
        }
        "@" !in email ->{
            println("your email is invalid")
        }
        password.isEmpty()->{
            println("you need to choose a  password ")
        }
        password.length < 10 ->{
            println("password not strong enough")
        }
        else ->{
            println("email length: ${email.length}, "+
            "password length:${password.length}")
        }
    }
}