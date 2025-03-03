

fun main() {
    println("Count: ${countDuplicates("aabBcde")}")

}
fun countDuplicates(text: String) {
    val charCounts = text.lowercase()
        .groupingBy { it }
        .eachCount()
        .filter { it.value > 1 }



    println("${charCounts.size}  (${charCounts.keys.joinToString(" and ")} are duplicate)")
}