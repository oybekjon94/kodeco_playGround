package `Use Data Types & Operations`

//Logical operators ! && ||
//unresolved reference-hal qilinmagan holat
fun main(){
    val passingGrade = 50
    val studentGrade = 50
    val chrisGrade = 49
    val samGrade = 99

    val studentPassed = studentGrade >= passingGrade
    val chrisPassed = chrisGrade >= passingGrade
    val samPassed = samGrade >= passingGrade

    println(!samPassed)
    println(!chrisPassed)

    //&&
    val bothPassed = chrisPassed && samPassed
    println(bothPassed) //result-> false

    // ||
    val eitherPassed = chrisPassed || samPassed
    println(eitherPassed) //result-> true

    val anyonePassed = chrisPassed || samPassed || studentPassed
    println(anyonePassed) //result-> true

    val everyonePassed = chrisPassed && samPassed && studentPassed
    println(everyonePassed) //result-> false

    val meritAwardGrade = 90
    val samHasPerfectAttendance = true

    val samIsMeritStudent = samHasPerfectAttendance && samGrade > meritAwardGrade
    println(samIsMeritStudent) //result--> true

}