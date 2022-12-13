package `functions&nullability`

fun main(){
    val myName = "Oybek"
    val nickName: String? = "oybe"
    val lastName: String? = null
    val nickNameLength = nickName?.length?.toDouble()
    val myNickName = nickName?: myName
    println(myNickName)

    println(nickNameLength)

    println(nickName)

    if(lastName != null){
        println("my last name is ${lastName.length} characters long")
    }else{
        println("I don't have a last name")
    }

    if (nickName?.isEmpty() == true){
        println("you don't have a nickname! It's length is: ${nickName.length}")
    }
}