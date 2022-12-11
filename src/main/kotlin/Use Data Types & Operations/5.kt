package `Use Data Types & Operations`

fun main(){
    val chrisGrade = 49
    val samGrade = 99
    val meritAwardGrade = 90
    val message: String
    val chrisHasPerfectStudent = true
    val chrisIsMeritStudent = chrisHasPerfectStudent && chrisGrade > meritAwardGrade
    println(chrisIsMeritStudent)

    message = if (chrisIsMeritStudent){
        "Congratulantions"
    }else{
        "Keep studying"
    }
    println(message)

    val betterStudent = if (samGrade >  chrisGrade)"Sam" else  "Chris"
    println(betterStudent)
}