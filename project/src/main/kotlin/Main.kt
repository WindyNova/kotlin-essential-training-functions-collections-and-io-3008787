
fun main() {
    val readOnlyList = listOf(1,2,3)
    readOnlyList.first()
    readOnlyList.take(3)
    readOnlyList.take(2)
    val mapp= mapOf(1 to "ok",2 to "ban")
   print(mapp.filter { it.key<2 })
    readOnlyList.filter { it>1 }

}