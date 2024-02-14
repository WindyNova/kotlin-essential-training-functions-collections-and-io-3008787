
fun main() {
    var counter = 0
    while (counter < 5) {
        print(counter)
        counter++
        if (counter == 3) break
    }
    do {
        println(counter)
        counter+=1

    } while (counter<5)


}