package companionObject

/*fun main(){
    val person2 = Person2("Oybek",28)
    person2.counter = 10
    val person3 = Person2("Umar",2)
    println(person2.counter)
    println(person3.counter)
}
class Person2(val name: String, val age: Int){
    var counter = 0

}
output: 10
        0
*/
fun main(){
    val database = DataBase
    database.counter = 10
    val database2 = DataBase
    println(database.counter)
    println(database2.counter)
}
object DataBase{
    var counter = 0
}
/*
output: 10
        10
 */
/*
objectni asosiy maqsadi application bo'yicha
bir marta yaratish.bir marta ozgarish kiritildimi
yana keyingi qismlarda xam ozgarishsiz qoladi

 */

