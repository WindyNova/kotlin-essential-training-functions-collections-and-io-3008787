import java.io.File

fun main() {
    print("Enter ")
val filename = readLine()?:""
    println("filename is $filename")
    if(File(filename).isFile)
    {
        println("okok")
    }
}