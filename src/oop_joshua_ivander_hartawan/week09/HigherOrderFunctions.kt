package oop_joshua_ivander_hartawan.week09

fun main(){
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    println("OriginalData: $numbers")
    println("\n=== HOF: FILTER ===")

    val evens = numbers.filter { it % 2 == 0 }
    println("evens only: $evens")

    println("\n=== HOF: MAP ===")

    val multiplied = evens.map { it * 10 }
    val asStrings = multiplied.map { "Rp ${it}k"}
    println("multiplied by 10: $multiplied")
    println("formatted: $asStrings")

}