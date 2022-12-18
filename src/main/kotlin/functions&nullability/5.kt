package `functions&nullability`

/*
Challenge 1:
-create a function which takes in two
parameters - a name and a last name
-because not everyone has a last name,
leave the lastName parameter to be an empty
String if it is not passed in
-Then return how long the person's
full name is

Challenge 2:
Overload the function from the first
challenge by adding a list of Strings
parameters , for middle names
in case someone has one or more middle name

use the function to return the full name
length , for a name with and without
middle names.
remember to use named arguments of needed
 */
fun main(){
   fun getFullNameLength(name: String, lastName: String = "")=
       name.length + lastName.length

    fun getFullNameLength(name: String,middleName: String = "", lastName: String = ""): Int{
        return name.length + middleName.length + lastName.length
    }

    val nameLength = getFullNameLength("Ayo","Balogun")
    println(nameLength)

    val length = getFullNameLength("Damini","EbunoLuwa","Oquli")
    println(length)
}