fun main() {
    var q1 = arrayOf<String>("What is the name of the programming language used to shape the front end of websites?", "html")
    var q2 = arrayOf<String>("What programming language is most popular right now?", "python")
    var q3 = arrayOf<String>("What programming language is best used for handling relational structured data?", "sql")
    var q4 = arrayOf<String>("What is the most popular low level programming language for game development?", "c++")
    var q5 = arrayOf<String>("What is the name of googles nosql database?", "Firebase")

    var questions = arrayOf(q1, q2, q3, q4, q5)

    var correctCount:Int = 0

    for (question in questions){
        println(question[0])

        var userEntry = readln()

        if (userEntry.contains(question[1], ignoreCase = true)){
            println("Correct")
            correctCount++
        }else{
            println("Incorrect")
        }
        println("You Got: $correctCount Questions Right!")


    }

}