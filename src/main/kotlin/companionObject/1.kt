package companionObject

fun main(){
    val person = Person("Oybek",28)
    //Person.show() bunaqa qilib chaqira olmaymiz chunki bunaqa chaqirsak
    // companion object Person degan obyektga qarashli bolib qoladi
    Person.printMe()
}
class Person(val name:String, val age:Int){
    /*
    companion objectda tashqaridagilarni chaqira olmaymiz

     */
    companion object{
        val string = "Companion object String"
        fun printMe(){
            print(string)
        }
    }
    /*
    lekin tashqaridan companion objectdagi funksiya yoki
    functionlarni korsa boladi
     */
    fun show(){
        printMe()
    }
}