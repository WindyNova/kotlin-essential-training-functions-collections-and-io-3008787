
fun main() {
    val language = listOf("kotlin").filter { it.length>4 }.map { it.length }


    // Sequence
    val  sequance = sequenceOf("kotlin","javava")
    sequance.iterator().next().length.toByte()
    val aSSSequance = listOf(1,2,3,4).asSequence()

}