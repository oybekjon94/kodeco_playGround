package lambdas

class Student(val name: String, var grade: Int, var pet: String?,var libraryBooks: List<String>){
    fun getPassStatus(lowestPass: Int = 50){
        grade >= lowestPass
    }

    fun earnExtraCredit(){
        grade +=10
    }
}
val chris = Student(name = "Chris", grade = 49, pet = "Mango",
libraryBooks = listOf("the book of afrus","living by the code","mastering git"))
val sam = Student(name = "Sam", grade = 99, pet = null,
libraryBooks = listOf("mastering git"))
val catie = Student(name = "Catie", grade = 75, pet = "Ozma",
libraryBooks = listOf("Mogfather","Good Omens"))
val andrea = Student(name = "Andrea", grade = 88, pet = "Kitten",
libraryBooks = listOf("Dare to Lead","The Warrior's Apprentice"))

val students = arrayOf(chris,sam, catie, andrea)
//------------starter code---------
fun main(){
/*
Challenge-1 'forEach' & 'map'
there are two 'for' loops below
rewrite one of them using 'forEach' and the other with 'map'

 */
for(student in students){
    student.earnExtraCredit()
}
    students.forEach { student ->
        println("Old grade: ${student.grade}")
        student.earnExtraCredit()
        println("New grade: ${student.grade}")
    }

    val classLibraryBooks: MutableList<List<String>> = mutableListOf()
    for (student in students){
        classLibraryBooks.add(student.libraryBooks)
    }

    val classLibraryBooks2 = students.map{student ->
        student.libraryBooks
    }
    println(classLibraryBooks2)


/*
Challenge 2 ->mapNotNull
create a list of student pets
 */
val classPets = students.mapNotNull { it.pet }
println(classPets)
}

