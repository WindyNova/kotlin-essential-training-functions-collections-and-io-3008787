

fun main() {
    try {
        val message = "The value in ${10 / 0}"
    }
    catch (error: Throwable)
    {
        println(error)
    }
}