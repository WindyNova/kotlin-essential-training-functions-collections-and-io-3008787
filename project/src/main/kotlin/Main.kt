
fun main() {
    // Using the provided test scores, identify the 3 students
    // with the lowest test scores
println(testScores.toList().sortedBy{it.second
}.take(3))
    
}