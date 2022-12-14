package `functions&nullability`

/*
Challenge:
-Declare a variable of type String? cllaed  'password' and assign a value to it
-using an if expression ,check the level of password strengthand assign an appropiate
message to another constant named 'message'
-then print out the message
note: levels and messages are predefined and included in the project
 */
fun main(){
    val password: String = "12345"

    val message = if(password == null || password.isEmpty()){
        "ehm you need a password to keep safe"
    }else if (password.length in 1..5){
        "weak password !try adding a few more symbols to it"
    }else if (password.length in 6..10){
        "medium-strength password"
    }else if (password.length in 11..15){
        "no one is getting through this"
    }else{
        "ironclad"
    }

    println(message)
}
