
// Prompt the user to enter the name of the test scores file
// Read each line from the file
// Sort the scores from highest to lowest
// Pick the 3 highest scores
// Write those 3 userId/score pairs to a new file sorted.txt
import java.io.File

fun main() {
print("PLS text me ")
    val name = readLine()?:""
    if(name.isNotEmpty())
    {
     if(   File(name).isFile )
     {
         File(name).readLines()
     }

    }
    else
    {
        println("nononon")
        return
    }
}