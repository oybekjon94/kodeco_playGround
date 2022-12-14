package `functions&nullability`

fun main(){
    fun printHello(name: String = "world"){
        println("hello $name")
    }

    printHello("sam")
    printHello("chris")
    printHello()
}