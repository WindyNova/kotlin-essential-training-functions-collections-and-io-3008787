
fun main() {
val language = mutableSetOf("kotlon")
    println(language)
    language.add("javascrpt")
    language.remove("kotlin")
    val map1 = mapOf(Pair(123,"ok"),789 to "123")
    println(map1.entries.first())
    println(map1[123])
}