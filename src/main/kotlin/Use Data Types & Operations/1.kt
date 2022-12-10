package `Use Data Types & Operations`
/**
 * we learned main function [main]
 * */
fun main(){
    var age: Int = 32
    val name: String = "Oybek"
    val lastname: String = "Kholikov"
    val weight = 80.1
    println(name)
    println("$name is a coder")
    println(age)
    age += 1
    println(age)
    println("$name $lastname is $age years old and weights $weight kg")

    val fullName = "$lastname, $name"
    println(fullName)

    val ageAsString = age.toString()
    println(ageAsString)

    val ageFromString = "35".toInt()
    println(ageFromString)

    val nameLength = fullName.length
    println(nameLength)
}